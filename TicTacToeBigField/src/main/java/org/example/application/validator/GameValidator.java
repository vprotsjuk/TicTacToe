package org.example.application.validator;

import org.example.application.dto.CreateGameRequest;
import org.example.application.dto.GameDTO;

public class GameValidator {
    public void validate(GameDTO gameDTO) {

        if (gameDTO.getName() == null || gameDTO.getName().length() == 0) {
            throw new RuntimeException("Name can not be null");
        }
        if (gameDTO.getPassword() == null || gameDTO.getPassword().length() == 0) {
            throw new RuntimeException("Password can not be null");
        }
    }
}
