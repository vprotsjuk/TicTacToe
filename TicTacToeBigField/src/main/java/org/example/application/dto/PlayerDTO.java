package org.example.application.dto;

public class PlayerDTO {
    String name;
    char symbol;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerDTO() {

    }
    public PlayerDTO(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;

    }
}
