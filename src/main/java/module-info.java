module com.example.sudoku {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jfr;


    opens com.example.sudoku to javafx.fxml;
    exports com.example.sudoku;
}