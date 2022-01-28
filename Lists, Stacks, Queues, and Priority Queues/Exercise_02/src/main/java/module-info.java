module com.sortlinkedlist.exercise_02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sortlinkedlist.exercise_02 to javafx.fxml;
    exports com.sortlinkedlist.exercise_02;
}