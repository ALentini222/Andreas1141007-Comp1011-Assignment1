package com.example.andreas1141007comp1011assignment1.Utilities;

import javafx.scene.chart.XYChart;
import com.example.andreas1141007comp1011assignment1.Models.game;
import java.sql.*;
import java.util.ArrayList;

public class DBUtilities {
    private static String user = "gamereview";
    private static String pw = "gamereview";
    private static String connectURL = "jdbc:mysql://localhost/Game_Information/game_review";

    public static XYChart.Series<String,Integer> getReviewsByPlaytime(){

        XYChart.Series<String, Integer> gameReviews = new XYChart.Series<>();

        String sql = "SELECT game_name, average_review" +
                "FROM games";
        try(
              Connection connection = DriverManager.getConnection(connectURL,user,pw);
              Statement statement = connection.createStatement();
              ResultSet resultSet = statement.executeQuery(sql);
                )
        {
            while (resultSet.next()){
            gameReviews.getData().add(new XYChart.Data<>(resultSet.getString("game_name"),
                    resultSet.getInt(2)));
        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return gameReviews;
    }

    public static ArrayList<game> getGameReviewTable(){
        ArrayList<game> game = new ArrayList<>();

        String sql = "SELECT gameID, game_name, average_rating, average_playtime FROM games";
        try(
                Connection connection = DriverManager.getConnection(connectURL,user,pw);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                ) {
            while(resultSet.next()){
                int gameId = resultSet.getInt("gameID");
                String name = resultSet.getString("game_name");
                int average_rating = resultSet.getInt("average_rating");
                int average_playtime = resultSet.getInt("average_playtime");

                game game1 = new game(gameId, name, average_rating, average_playtime);
                game1.setGameId(gameId);

                game.add(game1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return game;
    }
}
