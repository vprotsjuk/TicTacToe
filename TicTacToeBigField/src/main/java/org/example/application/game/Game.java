package org.example.application.game;

import org.example.application.dto.AddPlayerResponse;
import org.example.application.dto.MoveResponse;

public class Game {
    private Field field;
    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private GameStatus status = GameStatus.WAITING_FOR_OTHER_PLAYERS;
    int counter = 0;

    public Field getField()
    {
        return field;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }


    public GameStatus getStatus() {
        return status;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public void addPlayer(Player player){
        if (getPlayer1() == null) {
            setPlayer1(player);
            currentPlayer = player;
        }
        else if (getPlayer2() == null) {
            if(player.equals(getPlayer1())){
                throw new IllegalArgumentException("This Player already in Game");
            }
            setPlayer2(player);
            status = GameStatus.IN_PROGRESS;
        }
        else {
            throw new IllegalArgumentException("All places are occupied");
        }
    }

    public Game() {
        field = new Field();
    }

    public Game(Player player1, Player player2) {
        field = new Field();
        this.player1 = player1;
        this.player2 = player2;
        currentPlayer = player1;
    }

    public void makeMove(int row, int col, Player player) throws IllegalArgumentException {
        if (!player.equals(currentPlayer)){
            // TODO: ask stepan why it didn't suggest to add throws to the method signature
            throw new IllegalArgumentException("Not your move");
        }

        if (field.getField()[row][col] != '_') {
            throw new IllegalArgumentException("Field is not empty");
        }

        field.setSymbolInCell(row, col, currentPlayer.getSymbol());
        if (Winchecker.checkWin(field.getField(), currentPlayer.getSymbol())) {
            status = GameStatus.WIN;
            return;

        }
        counter++;
        if (counter == field.getField().length * field.getField().length) {
            status = GameStatus.DRAW;
            return;
        }
        field.print();
        nextPlayer();
    }


    private void nextPlayer() {
        if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

}
