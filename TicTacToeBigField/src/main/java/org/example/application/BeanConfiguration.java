package org.example.application;


import org.example.application.mapper.PlayerMapper;
import org.example.application.validator.AddPlayerRequestValidator;
import org.example.application.validator.CreateGameRequestValidator;
import org.example.application.validator.GameValidator;
import org.example.application.validator.PlayerValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class BeanConfiguration {

    @Bean
    public GameService getGameService(){
        return new GameService(getPlayerMapper(), getCreateGameRequestValidator(), getAddPlayerRequestValidator());
    }
    @Bean
    public AddPlayerRequestValidator getAddPlayerRequestValidator(){
        return new AddPlayerRequestValidator(getPlayerValidator(), getGameValidator());
    }

    @Bean
    public PlayerValidator getPlayerValidator(){
        return new PlayerValidator();
    }

    @Bean
    public PlayerMapper getPlayerMapper(){
        return new PlayerMapper();
    }

    @Bean
    public CreateGameRequestValidator getCreateGameRequestValidator(){
        return new CreateGameRequestValidator(getGameValidator());
    }

    @Bean
    public GameValidator getGameValidator(){
        return new GameValidator();
    }

}

