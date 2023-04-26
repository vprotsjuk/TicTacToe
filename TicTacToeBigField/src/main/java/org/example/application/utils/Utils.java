package org.example.application.utils;

public class Utils {
    public static String[][] convertCharToString(char[][] array){
        String [][] result  = new String[array.length][];
        for(int i = 0; i < array.length; i++){
            result [i] = new String[array[i].length];
            for (int j = 0; j < array[i].length; j++){
                result[i][j] = String.valueOf(array[i][j]);
            }
        }
        return result;
    }
}
