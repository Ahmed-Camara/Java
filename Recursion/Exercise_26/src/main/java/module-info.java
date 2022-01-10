module com.example.exercise_26 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exercise_26 to javafx.fxml;
    exports com.example.exercise_26;
}