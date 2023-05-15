module com2.exo6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jconsole;

    opens com2.exo6 to javafx.fxml;
    exports com2.exo6;
}