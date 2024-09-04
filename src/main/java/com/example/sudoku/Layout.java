package com.example.sudoku;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Layout {
    private VBox topVBox;
    private Button closeButton;
    private Button startButton;

    public void createVBoxLayout(){
        topVBox = new VBox();
        Rectangle placeHolder = new Rectangle(400,400, Color.BLUE);
        startButton = new Button("Start");
        closeButton = new Button("Close");
        HBox closeBox = new HBox(closeButton);
        HBox startBox = new HBox(startButton);
        closeBox.setAlignment(Pos.BASELINE_RIGHT);
        startBox.setAlignment(Pos.BASELINE_LEFT);
        HBox bottomControls = new HBox(startBox,closeBox);
        HBox.setHgrow(closeBox, Priority.ALWAYS);
        topVBox.getChildren().addAll(placeHolder,bottomControls);
    }

    public VBox getTopVBox(){
        return topVBox;
    }

    //@todo:
    //Error: .getScene returns null
    public void setEventHandling(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        closeButton.setOnMouseClicked(e ->
                stage.close());
    }
}
