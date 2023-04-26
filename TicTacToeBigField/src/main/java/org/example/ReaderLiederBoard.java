//package org.example;
//
//import com.google.gson.Gson;
//import org.example.DTO.LeaderBoardDTO;
//
//import java.io.IOException;
//import java.io.Reader;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class ReaderLiederBoard {
//    Gson gs = new Gson();
//    public LeaderBoardDTO read(String path) throws IOException {
//
//        Reader reader = Files.newBufferedReader(Paths.get(path));
//        LeaderBoardDTO lb = gs.fromJson(reader, LeaderBoardDTO.class);
//        return lb;
//    }
//
//
//}
