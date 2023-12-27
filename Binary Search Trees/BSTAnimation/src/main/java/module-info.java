module org.bstanimation.bstanimation {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.bstanimation.bstanimation to javafx.fxml;
    exports org.bstanimation.bstanimation;
    exports org.bstanimation.bstanimation.controller;
    opens org.bstanimation.bstanimation.controller to javafx.fxml;
}