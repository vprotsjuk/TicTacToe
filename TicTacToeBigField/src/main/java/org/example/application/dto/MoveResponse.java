package org.example.application.dto;

import org.example.application.game.GameStatus;

public class MoveResponse {
    private boolean success;
    private String error;
    GameStatus status;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public GameStatus getStatus() {
        return status;
    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }

    public MoveResponse(boolean success, String error, GameStatus status) {
        this.success = success;
        this.error = error;
        this.status = status;
    }

    public MoveResponse() {
    }
}
