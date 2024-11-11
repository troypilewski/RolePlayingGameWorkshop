module com.app.rpgws {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.app.rpgws to javafx.fxml;
    exports com.app.rpgws;
    exports com.app.rpgws.controller;
    opens com.app.rpgws.controller to javafx.fxml;
}