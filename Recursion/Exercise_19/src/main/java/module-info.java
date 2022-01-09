module com.fractals.exercise_19 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.fractals.exercise_19 to javafx.fxml;
    exports com.fractals.exercise_19;
}