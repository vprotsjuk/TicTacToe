package org.example.DTO;

import java.util.HashMap;
import java.util.Map;

public class LeaderBoardDTO {
    Map <String, Record> map;

    public Map<String, Record> getMap() {
        return map;
    }

    public LeaderBoardDTO() {
        this.map = new HashMap<>();
    }

    public void addRecord(String username, Record record){
        map.put(username, record);
    }
    public Record getRecord(String username){
        return map.get(username);
    }


    @Override
    public String toString() {
        return "LeaderBoardDTO{" +
                "map=" + map +
                '}';
    }
}
