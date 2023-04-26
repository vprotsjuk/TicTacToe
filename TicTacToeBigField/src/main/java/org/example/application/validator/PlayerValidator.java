package org.example.application.validator;

import org.example.application.dto.PlayerDTO;

public class PlayerValidator {

    public void validate (PlayerDTO playerDTO){
        if (!(playerDTO.getSymbol() == 'X' || playerDTO.getSymbol() == '0')){
            throw  new RuntimeException("Player Symbol is incorrect. Must be (X) or (0)");
        }
        if (playerDTO.getName() == null || playerDTO.getName().length() == 0){
            throw  new RuntimeException("Name can not be null");
        }
    }
}
