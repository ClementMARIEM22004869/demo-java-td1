module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jconsole;
    exports com.example.partie1;


    opens com2.ex4 to javafx.fxml;
    exports com2.ex4;
}