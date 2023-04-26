//package org.example;
//
//import com.google.gson.Gson;
//import org.example.DTO.LeaderBoardDTO;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.Writer;
//
//public class WriterLeaderBoard {
//    public void write(String path, LeaderBoardDTO lb) throws IOException {
//        Gson gs = new Gson();
//        try (Writer writer= new FileWriter(path)) {
//            gs.toJson(lb, writer);
//        }
//    }
//
//}
