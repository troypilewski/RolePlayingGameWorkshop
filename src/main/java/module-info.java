module com.app.rpgws {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.management;

    opens com.app.rpgws to javafx.fxml;
    opens com.app.rpgws.controllers to javafx.fxml;

    exports com.app.rpgws;
    exports com.app.rpgws.controllers;
}