package com.Pietrov98.chatwebapp.controllers;

import com.Pietrov98.chatwebapp.models.Room;
import com.Pietrov98.chatwebapp.repositories.RoomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//@Rest Controller //trzeba jakos inne sciezki dac
@Controller //przy controlerze board zwraca mi całą stronę, zastanowić się nad RestControllerem
public class BoardController {
    private RoomRepository repository;

    private BoardController(RoomRepository repository){
        this.repository = repository;
    }

    @GetMapping("/webChat")
    public String rooms(){
        return "index";
    }

    @PostMapping(value="/webChat", params={"room_name", "password", "max_users_number"})
    //@ResponseBody //zwraca stringa a nie widok
    @ResponseStatus(value = HttpStatus.OK)
    public void createRoom(@RequestParam("room_name") String room_name, @RequestParam("password") String password,
                                   @RequestParam("max_users_number") Integer max_users_number){
        Room room = new Room();
        room.setRoomName(room_name);
        room.setPassword(password);
        room.setCurrentUsersNumber(1);
        room.setMaxUsersNumber(max_users_number);
        repository.save(room);
    }

    @GetMapping(value="/webChat", params={"user_name"})
    //@ResponseBody //zwraca stringa a nie widok
    public String addUser(@RequestParam("user_name") String name){
        System.out.println(name);
        return "index";
    }

    @PostMapping(value="/webChat", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<Room>> findAllRooms() {
        return ResponseEntity.ok(repository.findAll());
    }
}
