module com.example.exercise_20 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_20 to javafx.fxml;
    exports com.example.exercise_20;
}