module com.example.andreas1141007comp1011assignment1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.example.andreas1141007comp1011assignment1 to javafx.fxml;
    exports com.example.andreas1141007comp1011assignment1;
    exports com.example.andreas1141007comp1011assignment1.Controllers;
    opens com.example.andreas1141007comp1011assignment1.Controllers to javafx.fxml;
}