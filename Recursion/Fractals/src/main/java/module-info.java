module com.fractals.fractals {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.fractals.fractals to javafx.fxml;
    exports com.fractals.fractals;
}