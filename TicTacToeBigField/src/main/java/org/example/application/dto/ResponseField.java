package org.example.application.dto;

public class ResponseField {
    private Boolean success;
    private String error;
    private String[][] field;

    public ResponseField(Boolean success, String error, String[][] field) {
        this.success = success;
        this.error = error;
        this.field = field;
    }

    public ResponseField() {
    }

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

    public String[][] getField() {
        return field;
    }

    public void setField(String[][] field) {
        this.field = field;
    }
}
