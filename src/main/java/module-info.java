module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jconsole;
    exports com.example.partie1;


    opens com.example.demo to javafx.fxml;
    exports com.exo.exo1;
}