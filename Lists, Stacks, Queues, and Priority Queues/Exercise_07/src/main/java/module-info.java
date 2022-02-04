module com.example.exercise_07 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_07 to javafx.fxml;
    exports com.example.exercise_07;
}