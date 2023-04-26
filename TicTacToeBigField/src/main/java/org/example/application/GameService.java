package org.example.application;

import org.example.application.dto.*;
import org.example.application.game.Field;
import org.example.application.game.Game;
import org.example.application.game.GameStatus;
import org.example.application.mapper.PlayerMapper;
import org.example.application.utils.Utils;
import org.example.application.validator.AddPlayerRequestValidator;
import org.example.application.validator.CreateGameRequestValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class GameService {
    PlayerMapper playerMapper;

    Map<String, Game> games = new HashMap<>();
    CreateGameRequestValidator createGameRequestValidator;
    AddPlayerRequestValidator addPlayerRequestValidator;

    @Autowired
    public GameService(PlayerMapper playerMapper, CreateGameRequestValidator createGameRequestValidator, AddPlayerRequestValidator addPlayerRequestValidator) {
        this.playerMapper = playerMapper;
        this.createGameRequestValidator = createGameRequestValidator;
        this.addPlayerRequestValidator = addPlayerRequestValidator;
    }

    public AddPlayerResponse addPlayer(AddPlayerRequest request) {
        try {
            addPlayerRequestValidator.validate(request);
        } catch (Exception e) {
            return new AddPlayerResponse(false, e.getMessage());
        }
        Game game =  games.getOrDefault(request.getGame().getName(), null);
        if(game == null){
            return new AddPlayerResponse(false, "That game not exist");
        }
        game.addPlayer(PlayerMapper.playerDTOtoPlayer(request.getPlayer()));
        return new AddPlayerResponse(true, null);

    }


    public CreateGameResponse createGame(CreateGameRequest request) {
        try {
            createGameRequestValidator.validate(request);
        } catch (Exception e) {
            return new CreateGameResponse(false, e.getMessage());
        }
        Game game =  games.getOrDefault(request.getGame().getName(), null);
        if(game != null){
            return new CreateGameResponse(false, "Named game exist");
        }
        games.put(request.getGame().getName(), new Game());
        return new CreateGameResponse(true, null);
    }

    public MoveResponse makeMove(MoveRequest request){
        Game game =  games.getOrDefault(request.getGame().getName(), null);
        if(game == null){
            return new MoveResponse(false, "Game does not exist", null);
        }
        if(!game.getStatus().equals(GameStatus.IN_PROGRESS)){
            return new MoveResponse(false, "Game is over", game.getStatus());

        }
        try {
            game.makeMove(request.getCoordinate().getRow(), request.getCoordinate().getCol(), PlayerMapper.playerDTOtoPlayer(request.getPlayer()));
            return new MoveResponse(true, null, GameStatus.IN_PROGRESS);
        }catch (IllegalArgumentException e){
            return new MoveResponse(false, e.getMessage(), null);
        }
//        if(game.getCurrentPlayer().getName().equals(request.getPlayer().getName()) && game.getCurrentPlayer().getSymbol()==request.getPlayer().getSymbol()){
//            return new MoveResponse(true, null, game.getStatus());
//        }
//        return new MoveResponse(false, "Not your move", null);

    }

    public ResponseField getField (RequestField request) {
        Game game = games.getOrDefault(request.getGame().getName(), null);
        if (game == null) {
            return new ResponseField(false, "Game does not exist", null);
        }
        ResponseField responseField = new ResponseField(true, null, Utils.convertCharToString(game.getField().getField()));
        return responseField;
    }
}
