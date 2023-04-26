package org.example;

import java.util.Scanner;

public class Reader {

    public String readTextFromPlayer(String msg){
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println();
                System.out.println(msg);
                String s = scanner.next();
//            scanner.close();
                return s;
            } catch (Exception e) {
                System.out.println("Error read text");
            }
        }

    }

    public int readInt(String msg, int min, int max) {
        while(true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println();
                System.out.println(msg);
                int val = scanner.nextInt();
                if (val >= min && val <= max) {
                    return val;
                }
            }
            catch (Exception e){
                System.out.println("Error read value!");
            }

        }

    }

}
