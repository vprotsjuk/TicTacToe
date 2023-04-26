package org.example.application.validator;

import org.example.application.dto.CreateGameRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateGameRequestValidator {
    GameValidator gameValidator;

    @Autowired
    public CreateGameRequestValidator(GameValidator gameValidator) {
        this.gameValidator = gameValidator;
    }
    public  void validate(CreateGameRequest createGameRequest){
        if (createGameRequest.getGame() == null){
            throw new RuntimeException("Game can not be null");
        }
        gameValidator.validate(createGameRequest.getGame());
    }
}
