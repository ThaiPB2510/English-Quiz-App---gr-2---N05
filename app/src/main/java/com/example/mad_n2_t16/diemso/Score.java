package com.example.mad_n2_t16.diemso;

public class Score {
    private int id;
    private String name;
    private double score;
    private String date;
    private String room;

    public Score(String name, double score, String room) {
        this.name = name;
        this.score = score;
        this.room = room;
    }

    public Score() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
