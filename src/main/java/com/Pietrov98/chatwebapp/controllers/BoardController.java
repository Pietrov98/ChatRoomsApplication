package com.Pietrov98.chatwebapp.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Rest Controller trzeba jakos inne sciezki dac
@Controller
public class BoardController {

    @GetMapping("/webChat")
    public String rooms(){
        return "board";
    }

    @GetMapping(value="/webChat", params={"room_name", "password", "qty"})
    public String startRoom(@RequestParam("room_name") String room_name, @RequestParam("password") String password,
                            @RequestParam("qty") String qty){
        System.out.println(room_name + " " + password + " " + qty + " " );
        return "board"; //tutaj bedzie zwracana strona z chatem
    }

    @PostMapping(value="/webChat", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void getUserName(@RequestParam("name") String name){
    }

}
