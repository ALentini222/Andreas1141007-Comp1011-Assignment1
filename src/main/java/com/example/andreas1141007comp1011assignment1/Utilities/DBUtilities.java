package com.example.andreas1141007comp1011assignment1.Utilities;

import javafx.scene.chart.XYChart;

import java.sql.*;

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
}
