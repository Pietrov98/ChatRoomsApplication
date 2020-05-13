package com.Pietrov98.chatwebapp.board;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BoardController {

    @GetMapping("/webChat")
    public String rooms(@RequestParam(name="user_name", required = false) String name){
        System.out.println("to tez dziala");
        return "board";
    }

    @RequestMapping(value = "/webChat", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getUserName(@RequestParam("name") String name){
        System.out.println(name);
        return  new ResponseEntity(HttpStatus.OK);
    }
}
