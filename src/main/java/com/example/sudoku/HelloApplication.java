package com.example.sudoku;

import Model.Board;
import JUnitTest.JUnitTest;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        JUnitTest jUnitTest = new JUnitTest();
        jUnitTest.testCoord();
        Layout layout = new Layout();
        layout.createVBoxLayout();
        layout.setEventHandling(stage);
        Scene scene = new Scene(layout.getTopVBox());
        Board newBoard = new Board();
        stage.setTitle("Sudoku App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}