package org.example.application.dto;

public class RequestField {
    GameDTO game;

    public GameDTO getGame() {
        return game;
    }

    public void setGame(GameDTO game) {
        this.game = game;
    }

    public RequestField() {
    }

    public RequestField(GameDTO game) {
        this.game = game;
    }
}
