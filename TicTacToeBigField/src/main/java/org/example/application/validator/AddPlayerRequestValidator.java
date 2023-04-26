package org.example.application.validator;

import org.example.application.dto.AddPlayerRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class AddPlayerRequestValidator {
    PlayerValidator playerValidator;
    GameValidator gameValidator;

    @Autowired
    public AddPlayerRequestValidator(PlayerValidator playerValidator, GameValidator gameValidator) {
        this.playerValidator = playerValidator;
        this.gameValidator = gameValidator;
    }
    public void validate(AddPlayerRequest addPlayerRequest){
        if(addPlayerRequest.getPlayer() == null){
            throw new RuntimeException("Player can not be null");
        }
        if(addPlayerRequest.getGame() == null){
            throw new RuntimeException("Game can not be null");

        }
        playerValidator.validate(addPlayerRequest.getPlayer());
        gameValidator.validate(addPlayerRequest.getGame());
    }

}
