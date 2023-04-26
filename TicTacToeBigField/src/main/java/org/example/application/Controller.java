package org.example.application;

import org.example.application.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    GameService gameService;
    @Autowired
    public Controller(GameService gameService) {
        this.gameService = gameService;
    }

    @PostMapping("/add_player")
    public AddPlayerResponse addPlayer(@RequestBody AddPlayerRequest request){
        return gameService.addPlayer(request);
    }
    @PostMapping("/create_game")
    public CreateGameResponse createGame (@RequestBody CreateGameRequest request){
        System.out.println(request.getGame().toString() + " HELLO EVERYBODY");
        return gameService.createGame(request);
    }
    @PostMapping("/move")
    public MoveResponse makeMove(@RequestBody MoveRequest request){
        return gameService.makeMove(request);
    }
    @PostMapping("/field")
    public  ResponseField getField (@RequestBody RequestField request){
        return gameService.getField(request);
    }
}
