package org.example.application.game;

import java.util.Objects;

public class Player {
    String name;
    char symbol;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return symbol == player.symbol || name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, symbol);
    }

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

    public Player() {

    }
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;

    }
}
