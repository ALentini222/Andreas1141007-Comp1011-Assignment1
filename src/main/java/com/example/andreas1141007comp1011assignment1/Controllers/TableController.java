package com.example.andreas1141007comp1011assignment1.Controllers;
import com.example.andreas1141007comp1011assignment1.Models.game;
import com.example.andreas1141007comp1011assignment1.Utilities.DBUtilities;
import com.example.andreas1141007comp1011assignment1.Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableController {

    @FXML
    private TableView<game> tableView;

    @FXML
    private TableColumn<game, Integer> gameId;

    @FXML
    private TableColumn<game, String> name;

    @FXML
    private TableColumn<game, Integer> rating;

    @FXML
    private TableColumn<game, Integer> playtime;
    /*
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        gameId.setCellValueFactory(new PropertyValueFactory<>("gameId"));
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        rating.setCellValueFactory(new PropertyValueFactory<>("rating"));
        playtime.setCellValueFactory(new PropertyValueFactory<>("playtime"));

        tableView.getItems().addAll(DBUtilities.getGameReviewTable());
    }
*/
    @FXML
    private void changeToGraphView(ActionEvent event) throws IOException {
        SceneChanger.changeScenes(event, "game-review.fxml","View Graph");
    }
}
