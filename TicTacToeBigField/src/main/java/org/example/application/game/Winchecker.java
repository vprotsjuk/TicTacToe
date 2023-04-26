package org.example.application.game;

public class Winchecker {
    int spR; // StartPointRow
    int spC; // StartPointCol
    ;

    public Winchecker() {
//        this.spR = spR;
//        this.spC = spC;
    }

    public int getSpR() {
        return spR;
    }

    public int getSpC() {
        return spC;
    }


    private static boolean hasWin(char[][] field, char Xor0) {
        Winchecker wc = new Winchecker();

        for (wc.spR = 1; wc.spR < field.length; wc.spR += 3) {
            for (wc.spC = 1; wc.spC < field[0].length; wc.spC += 3) {
                boolean isFirstRow = (field[wc.spR][wc.spC] == field[wc.spR][wc.spC + 1] && field[wc.spR][wc.spC] == field[wc.spR][wc.spC + 2] && field[wc.spR][wc.spC + 2] == Xor0);
                boolean isSecondRow = (field[wc.spR + 1][wc.spC] == field[wc.spR + 1][wc.spC + 1] && field[wc.spR + 1][wc.spC] == field[wc.spR + 1][wc.spC + 2] && field[wc.spR + 1][wc.spC + 2] == Xor0);
                boolean isThirdRow = (field[wc.spR + 2][wc.spC] == field[wc.spR + 2][wc.spC + 1] && field[wc.spR + 2][wc.spC] == field[wc.spR + 2][wc.spC + 2] && field[wc.spR + 2][wc.spC + 2] == Xor0);
                boolean isFirstCol = (field[wc.spR][wc.spC] == field[wc.spR + 1][wc.spC] && field[wc.spR][wc.spC] == field[wc.spR + 2][wc.spC] && field[wc.spR + 2][wc.spC] == Xor0);
                boolean isSecondCol = (field[wc.spR][wc.spC + 1] == field[wc.spR + 1][wc.spC + 1] && field[wc.spR][wc.spC + 1] == field[wc.spR + 2][wc.spC + 1] && field[wc.spR + 2][wc.spC + 1] == Xor0);
                boolean isThirdCol = (field[wc.spR][wc.spC + 2] == field[wc.spR + 1][wc.spC + 2] && field[wc.spR][wc.spC + 2] == field[wc.spR + 2][wc.spC + 2] && field[wc.spR + 2][wc.spC + 2] == Xor0);
                boolean isFirstDia = (field[wc.spR][wc.spC] == field[wc.spR + 1][wc.spC + 1] && field[wc.spR][wc.spC] == field[wc.spR + 2][wc.spC + 2] && field[wc.spR + 2][wc.spC + 2] == Xor0);
                boolean isSecondDia = (field[wc.spR][wc.spC + 2] == field[wc.spR + 1][wc.spC + 1] && field[wc.spR][wc.spC + 2] == field[wc.spR + 2][wc.spC] && field[wc.spR + 2][wc.spC] == Xor0);
                if (isFirstRow || isSecondRow || isThirdRow || isFirstCol || isSecondCol || isThirdCol
                        || isFirstDia || isSecondDia) {
                    for (int i = wc.getSpR(); i < wc.getSpR() + 3; i++) {
                        for (int j = wc.getSpC(); j < wc.getSpC() + 3; j++) {
                            field[i][j] = ' ';
                            field[wc.getSpR() + 1][wc.getSpC() + 1] = Xor0;
                        }
                    }
                    System.out.println();
                    return true;
                }
            }
        }
        return false;
    }


    private static boolean hasWinBig(char[][] field, char Xor0) {
        int i = 2;
        int j = 2;
        boolean isFirstRow = (field[i][j] == field[i][j + 3] && field[i][j] == field[i][j + 6] && field[i][j + 6] == Xor0);
        boolean isSecondRow = (field[i + 3][j] == field[i + 3][j + 3] && field[i + 3][j] == field[i + 3][j + 6] && field[i + 3][j + 6] == Xor0);
        boolean isThirdRow = (field[i + 6][j] == field[i + 6][j + 3] && field[i + 6][j] == field[i + 6][j + 6] && field[i + 6][j + 6] == Xor0);
        boolean isFirstCol = (field[i][j] == field[i + 3][j] && field[i][j] == field[i + 6][j] && field[i + 6][j] == Xor0);
        boolean isSecondCol = (field[i][j + 3] == field[i + 3][j + 3] && field[i][j + 3] == field[i + 6][j + 3] && field[i + 6][j + 3] == Xor0);
        boolean isThirdCol = (field[i][j + 6] == field[i + 3][j + 6] && field[i][j + 6] == field[i + 6][j + 6] && field[i + 6][j + 6] == Xor0);
        boolean isFirstDia = (field[i][j] == field[i + 3][j + 3] && field[i][j] == field[i + 6][j + 6] && field[i + 6][j + 6] == Xor0);
        boolean isSecondDia = (field[i][j + 6] == field[i + 3][j + 3] && field[i][j + 6] == field[i + 6][j] && field[i + 6][j] == Xor0);
        if (isFirstRow || isSecondRow || isThirdRow || isFirstCol || isSecondCol || isThirdCol
                || isFirstDia || isSecondDia) {
//            System.out.println(Xor0 + " Win");
            return true;
        }
        return false;
    }
    public static  boolean checkWin (char[][] field, char Xor0){

        hasWin(field, Xor0);
        return  hasWinBig(field, Xor0);
    }
}




