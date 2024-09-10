package com.example.sudoku;

import Model.BoardCoord;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Layout {
    private BoardCoord currField;
    private VBox topVBox;
    private Button closeButton;
    private Button startButton;

    public void createVBoxLayout(){
        topVBox = new VBox();
        topVBox.setSpacing(15);
        GridPane boardLayout = createEmptyBoard();
        startButton = new Button("Start");
        closeButton = new Button("Close");
        HBox closeBox = new HBox(closeButton);
        HBox startBox = new HBox(startButton);
        closeBox.setAlignment(Pos.BASELINE_RIGHT);
        startBox.setAlignment(Pos.BASELINE_LEFT);
        HBox bottomControls = new HBox(startBox,closeBox);
        HBox.setHgrow(closeBox, Priority.ALWAYS);
        topVBox.getChildren().addAll(boardLayout,bottomControls);
    }

    //todo: use new Coord Systems
    private GridPane createEmptyBoard(){
        GridPane topBoardLayout = new GridPane();
        topBoardLayout.setHgap(15);
        topBoardLayout.setVgap(15);
        GridPane[] innerBoardLayouts = new GridPane[9];
        Button[][][] buttonArray = new Button[3][3][9];
        for(int z=0;z<9;z++){
            innerBoardLayouts[z] = new GridPane();
            for(int x=0;x<3;x++){
                for (int y = 0; y < 3; y++){
                    buttonArray[x][y][z] = new Button();
                    buttonArray[x][y][z].setPrefWidth(75);
                    buttonArray[x][y][z].setPrefHeight(75);
                    innerBoardLayouts[z].add(buttonArray[x][y][z], x, y);
                }
            }
            topBoardLayout.add(innerBoardLayouts[z],(z%3),z/3);
        }
        return topBoardLayout;
    }

    public VBox getTopVBox(){
        return topVBox;
    }

    //todo: implement buttonclick -> focus Field
    public void setEventHandling(Stage stage){
        closeButton.setOnMouseClicked(e ->
                stage.close());
        for(int column=0;column<3;column++){
            for(int row=0;row<3;row++){
                for(int square=0;square<9;square++);
            }
        }
    }
}
