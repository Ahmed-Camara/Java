module com.bouncingballs.casestudybouncingballs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bouncingballs.casestudybouncingballs to javafx.fxml;
    exports com.bouncingballs.casestudybouncingballs;
}