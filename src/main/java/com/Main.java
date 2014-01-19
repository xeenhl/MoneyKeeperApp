package com;

import com.xeenhl.elements.UserChart;
import com.xeenhl.elements.UserTab;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        UserTab userTab = new UserTab();
        UserChart userChart = new UserChart();

        GridPane mainScene = new GridPane();
        mainScene.add(userTab.getElement(), 0, 0);
        mainScene.add(userChart.getElement(), 1, 0);

        Scene scene = new Scene(mainScene);

        primaryStage.setMinHeight(600);
        primaryStage.setMinWidth(700);

        primaryStage.setTitle("Money Keeper");

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
