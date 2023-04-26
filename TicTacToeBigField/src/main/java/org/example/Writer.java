package org.example;

import org.example.application.game.Field;
import org.example.application.game.Player;

public class Writer {

//    Player player;
    public void printAssignmentSymbolFofPlayer(Player player){
        System.out.println(player.getName() + ", your Symbol is '" + player.getSymbol() + "'" );
    }

    public void printFieldForConsole(Field field) {
        for (int i = 0; i < field.getField().length; i++) {
            System.out.println();
            if (i ==4 || i == 7){
                System.out.println(" ");
            }
            for (int j = 0; j < field.getField()[0].length; j++) {
                System.out.print(field.getField()[i][j] + " ");
                if (j == 3 || j == 6){
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
    public void printGameOverMassage(Player player){
        System.out.println(player.getName() + ", you are WIN, \nGAME OVER" );

    }



}
