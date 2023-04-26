package org.example.application.mapper;

import org.example.application.dto.PlayerDTO;
import org.example.application.game.Player;

public class PlayerMapper {

    public static Player playerDTOtoPlayer (PlayerDTO playerDTO){
        return  new Player(playerDTO.getName(), playerDTO.getSymbol());
    }
    public static PlayerDTO playerToPlayerDTO (Player player){
        return new PlayerDTO(player.getName(),  player.getSymbol());
    }
}
