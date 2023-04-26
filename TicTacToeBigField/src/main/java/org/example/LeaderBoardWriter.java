//package org.example;
//
//import java.io.*;
//import java.util.Scanner;
//
//public class LeaderBoardWriter {
//
//    public LeaderBoardWriter(File tempFile) {
//
//    }
//
//    public static void updateLeaderBoard() throws IOException {
//        String ID;
//        int count;
//
//        int countIncreaser;
//
//        Scanner console = new Scanner(System.in);
//        System.out.print("Enter ID : ");
//        String pID = console.nextLine();
//        System.out.print("Enter countIncreaser count: ");
//        countIncreaser = console.nextInt();
//
//        File originalFile = new File("/Users/vitaliiprotsiuk/TicTacToeBigField/LeaderBoard.txt");
//        BufferedReader br = new BufferedReader(new FileReader(originalFile));
//
//        // Construct the new file that will later be renamed to the original
//        // filename.
//        File tempFile = new File("/Users/vitaliiprotsiuk/TicTacToeBigField/tempLeaderBoard.txt");
//        PrintWriter pw = new PrintWriter(new LeaderBoardWriter(tempFile));
//
//        String line = null;
//        // Read from the original file and write to the new
//        // unless content matches data to be removed.
//        while ((line = br.readLine()) != null) {
//
//            if (line.contains(pID)) {
//                String strCurrentSalary = line.substring(line.lastIndexOf(" "), line.length());
//                if (strCurrentSalary != null || !strCurrentSalary.trim().isEmpty()) {
//                    int replenishedSalary = Integer.parseInt(strCurrentSalary.trim()) + countIncreaser;
//                    System.out.println("replenishedSalary : " + replenishedSalary);
//                    line = line.substring(0,line.lastIndexOf(" ")) + replenishedSalary;
//                }
//
//            }
//            pw.println(line);
//            pw.flush();
//        }
//        pw.close();
//        br.close();
//
//        // Delete the original file
//        if (!originalFile.delete()) {
//            System.out.println("Could not delete file");
//            return;
//        }
//
//        // Rename the new file to the filename the original file had.
//        if (!tempFile.renameTo(originalFile))
//            System.out.println("Could not rename file");
//
//    }
//}
