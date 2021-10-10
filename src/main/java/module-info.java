module com.example.andreas1141007comp1011assignment1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.andreas1141007comp1011assignment1 to javafx.fxml;
    exports com.example.andreas1141007comp1011assignment1;
}