package com.app.rpgws.view;

public enum View {
    MAIN("/com/app/rpgws/fxml/main.fxml");

    private final String path;

    View(String path) {
        this.path = path;
    }
    public String getFilepath() {
        return path;
    }
}
