package org.example.DTO;

import java.time.Instant;
import java.util.Date;

public class Record {
    int score;
    Date date;

    public Record() {
        this.date = Date.from(Instant.now());
    }
    public Record(int score) {
        this.score = score;
        this.date = Date.from(Instant.now());
    }

    public int getScore() {
        return score;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Record{" +
                "score=" + score +
                ", date=" + date +
                '}';
    }
    public void increaseScore(){
        this.score++;
    }
}
