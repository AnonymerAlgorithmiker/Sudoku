module com.example.sudoku {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jfr;
    requires junit;


    opens com.example.sudoku to javafx.fxml;
    exports com.example.sudoku;
}