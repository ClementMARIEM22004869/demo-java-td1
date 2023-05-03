module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    exports com.example.partie1;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}