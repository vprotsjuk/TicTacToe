package org.example.application.dto;

public class AddPlayerRequest {

    GameDTO game;
    PlayerDTO player;

    public GameDTO getGame() {
        return game;
    }

    public void setGame(GameDTO game) {
        this.game = game;
    }

    public PlayerDTO getPlayer() {
        return player;
    }

    public void setPlayer(PlayerDTO player) {
        this.player = player;
    }

    public AddPlayerRequest(GameDTO game, PlayerDTO player) {
        this.game = game;
        this.player = player;
    }

    public AddPlayerRequest() {
    }
}
