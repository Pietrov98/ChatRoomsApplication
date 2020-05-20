package com.Pietrov98.chatwebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChatRoomController {

    @GetMapping("/webChat/chatroom")
    public String getRoom(){
        return "chat_room";
    }

}
