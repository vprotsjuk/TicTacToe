//package org.example;
//
//import org.example.application.game.Game;
//import org.example.application.game.GameStatus;
//import org.example.application.game.Player;
//
//public class Controller {
//    Reader reader;
//    Writer writer;
//    Game game;
//    Player player1;
//    Player player2;
//
//
//
//    public Controller(Reader reader, Writer writer) {
//        this.reader = reader;
//        this.writer = writer;
//    }
//
//    private Player createPlayer1() {
//        player1 = new Player();
//        player1.setName(reader.readTextFromPlayer("Player 1, type your name"));
//        player1.setSymbol(reader.readTextFromPlayer(player1.getName() + ", select your Symbol (X or 0)").toLowerCase().charAt(0));
//        if (player1.getSymbol() == 'x') {
//            player1.setSymbol('X');
//        } else {
//            player1.setSymbol('0');
//        }
//        writer.printAssignmentSymbolFofPlayer(player1);
//        return player1;
//    }
//
//    private Player createPlayer2() {
//        player2 = new Player();
//        player2.setName(reader.readTextFromPlayer("Player 2, type your name"));
//        if (player2.getName().equals(player1.getName())) {
//            while (player2.getName().equals(player1.getName())) {
//                player2.setName(reader.readTextFromPlayer("Player 2, type your name"));
//            }
//        }
//        if (player1.getSymbol() == 'X') {
//            player2.setSymbol('0');
//        } else {
//            player2.setSymbol('X');
//        }
//        writer.printAssignmentSymbolFofPlayer(player2);
//        return player2;
//
//
//    }
//
//
//    private void createGame() {
////        writer.printField(new Field());
//        Player p1 = createPlayer1();
//        Player p2 = createPlayer2();
//        this.game = new Game(p1, p2);
//    }
//
//    public void run() {
//        createGame();
//        while (game.getStatus() != GameStatus.WIN) {
//            int row = reader.readInt(game.getCurrentPlayer().getName() + ", select row", 1, game.  getField().getField().length);
//            int col = reader.readInt(game.getCurrentPlayer().getName() + ", select col", 1, game.getField().getField()[0].length);
//            game.makeMove(row, col, p);
//
//            writer.printFieldForConsole(game.getField());
//            if(game.getStatus() == GameStatus.WIN){
//                writer.printGameOverMassage(game.getCurrentPlayer());
//            }
//
//        }
//    }
//}
