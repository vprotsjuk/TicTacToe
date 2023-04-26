package org.example.application.dto;

public class MoveRequest {
    GameDTO game;
    PlayerDTO player;
    CoordinateDTO coordinate;

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

    public CoordinateDTO getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(CoordinateDTO coordinate) {
        this.coordinate = coordinate;
    }

    public MoveRequest() {
    }

    public MoveRequest(GameDTO game, PlayerDTO player, CoordinateDTO coordinate) {
        this.game = game;
        this.player = player;
        this.coordinate = coordinate;
    }
}
