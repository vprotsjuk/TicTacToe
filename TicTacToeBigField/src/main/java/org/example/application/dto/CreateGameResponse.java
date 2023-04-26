package org.example.application.dto;

public class CreateGameResponse {
    private Boolean success;
    private String error;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public CreateGameResponse(Boolean success, String error) {
        this.success = success;
        this.error = error;
    }

    public CreateGameResponse() {
    }
}
