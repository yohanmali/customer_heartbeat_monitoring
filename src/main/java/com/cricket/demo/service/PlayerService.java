package com.cricket.demo.service;

import com.cricket.demo.models.Name;
import com.cricket.demo.models.Players;
import com.cricket.demo.request.PlayersServiceRequest;
import com.cricket.demo.response.PlayersServiceResponse;
import org.springframework.stereotype.Service;

@Service
 public class PlayerService {

    public PlayersServiceResponse playerInfo(PlayersServiceRequest playersServiceRequest) {

        PlayersServiceResponse result = new PlayersServiceResponse();
        Players players = new Players();
        Name name = new Name();


        if (playersServiceRequest.getPlayerName().getFirstName().equals("sanath")) {
            players.setAge(55);
            players.setAvg(39.5);
            players.setGamesPlayed(412);
            players.setBestScore(187);
            name.setFirstName("Sanath");
            name.setLastName("Jayasooriya");
            players.setName(name);
            result.setPlayers(players);
        }

        return result;

    }
}
