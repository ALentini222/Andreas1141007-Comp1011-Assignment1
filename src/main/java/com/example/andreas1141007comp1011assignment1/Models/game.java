package com.example.andreas1141007comp1011assignment1.Models;

public class game {
    private int gameId, averageRating, averagePlaytime;
    private String name;
    
    public game(int gameId, String name, int averageRating, int averagePlaytime){
        setGameId(gameId);

    }
    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public int getAveragePlaytime() {
        return averagePlaytime;
    }

    public void setAveragePlaytime(int averagePlaytime) {
        this.averagePlaytime = averagePlaytime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
