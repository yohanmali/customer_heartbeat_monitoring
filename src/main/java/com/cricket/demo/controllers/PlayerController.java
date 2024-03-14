package com.cricket.demo.controllers;

import com.cricket.demo.request.PlayersServiceRequest;
import com.cricket.demo.response.PlayersServiceResponse;

import com.cricket.demo.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("lka/ticket")
    public PlayersServiceResponse sriLanka(@RequestBody PlayersServiceRequest playersServiceRequest) {

        PlayersServiceResponse playersServiceResponse = playerService.playerInfo(playersServiceRequest);
        return playersServiceResponse;
    }


//    @GetMapping()
//    public String sriLanka(int i) {
//
//        return null;
//    }




}
