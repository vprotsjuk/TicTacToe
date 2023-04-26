package org.example.application.game;

import java.util.Arrays;

public class Field {
    public static final int rowBigField = 10;
    public static final int colBigField = 10;
    private char[][] field = new char[rowBigField][colBigField];

    public char[][] getField() {
        return field;
    }

    public Field() {
        createField();
    }

    public void setSymbolInCell(int row, int col, char symbol) {
        field[row][col] = symbol;
    }

    public void print(){
        for (int i = 0; i < field.length; i++) {
            System.out.println();
            if (i ==4 || i == 7){
                System.out.println(" ");
            }
            for (int j = 0; j < field[0].length; j++) {
                System.out.print(field[i][j] + " ");
                if (j == 3 || j == 6){
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }

    private void createField() {
        char num1 = 48;
        char num2 = 49;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (i == 0) {
                    field[i][j] = num1;
                    num1++;
                } else {
                    field[i][j] = '_';
                    if (j == 0) {
                        field[i][j] = num2;
                        num2++;
                    } else {
                        field[i][j] = '_';
                    }
                }
            }

        }
    }
}

