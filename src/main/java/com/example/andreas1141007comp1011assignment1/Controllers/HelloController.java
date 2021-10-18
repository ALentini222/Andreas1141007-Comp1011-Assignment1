package com.example.andreas1141007comp1011assignment1.Controllers;

import com.example.andreas1141007comp1011assignment1.Utilities.DBUtilities;
import com.example.andreas1141007comp1011assignment1.Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private BarChart<String,Integer> barChart;

    @FXML
    private CategoryAxis  gameName;

    @FXML
    private NumberAxis gameReview;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

        //barChart.getData().addAll(DBUtilities.getReviewsByPlaytime());
        gameName.setLabel("Game Name");
        gameReview.setLabel("Game Review");
    }
    @FXML
    private void changeToTableView(ActionEvent event) throws IOException{
        SceneChanger.changeScenes(event, "table-view.fxml","View full data");
    }
}