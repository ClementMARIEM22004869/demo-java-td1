module com.example.partie3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jconsole;

    opens com.example.partie3 to javafx.fxml;
    exports com.example.partie3;
}