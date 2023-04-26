package org.example.application.dto;

public class CreateGameRequest {

    GameDTO game;

    public GameDTO getGame() {
        return game;
    }

    public void setGame(GameDTO game) {
        this.game = game;
    }

    public CreateGameRequest(GameDTO game) {
        this.game = game;
    }

    public CreateGameRequest() {
    }
}
