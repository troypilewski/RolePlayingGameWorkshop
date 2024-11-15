package com.app.rpgws.source.sw.model;

public enum Size {
    COLOSSAL("Colossal", -8),
    GARGANTUAN("Gargantuan", -4),
    HUGE("Huge", -2),
    LARGE("Large", -1),
    MEDIUM("Medium",0),
    SMALL("Small",1),
    TINY("Tiny", 2),
    DIMINUTIVE("Diminutive", 4),
    FINE("Fine", 8);

    private final String name;
    private final int modifier;

    Size(String name, int modifier) {
        this.name = name;
        this.modifier = modifier;
    }
}
