module com.example.exercise_05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_05 to javafx.fxml;
    exports com.example.exercise_05;
}