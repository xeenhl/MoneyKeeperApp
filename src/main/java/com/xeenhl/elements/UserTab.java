package com.xeenhl.elements;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

import java.io.IOException;

/**
 * Created by Oleh on 19.01.14.
 */
public class UserTab implements Element {

    private Parent userTab;

    public UserTab() {
        try {
            userTab = FXMLLoader.load(getClass().getResource("../../../elements/UserTab.fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public Node getElement() {
        if (userTab != null)
            return userTab;
        else
            return null;
    }

    @Override
    public void update() {

    }
}
