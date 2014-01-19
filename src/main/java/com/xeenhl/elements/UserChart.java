package com.xeenhl.elements;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Created by Oleh on 19.01.14.
 */
public class UserChart implements Element {
    private Parent userChart;

    public UserChart() {
        try {
            userChart = FXMLLoader.load(getClass().getResource("../../../elements/UserChart.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public Node getElement() {
        if (userChart != null)
            return userChart;
        else
            return null;
    }
    @Override
    public void update() {

    }
}
