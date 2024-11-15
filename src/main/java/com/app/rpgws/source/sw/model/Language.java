package com.app.rpgws.source.sw.model;

public enum Language {
    BASIC("Basic", true, true),
    BOTHESE("Bothese", true, true),
    CEREAN("Cerean", true, true),
    DOSH("Dosh", true, true),
    DUG("Dug", true, true),
    DURESE("Durese", true, true),
    EWOKESE("Ewokese", true, false),
    GAMORREAN("Gamorrean", true, false),
    GEONOSIAN("Geonosian", true, true),
    GUNGAN("Gungan", true, true),
    HUTTESE("Huttese", true, true),
    ITHORESE("Ithorese", true, true),
    JAWA_TRADE_LANGUAGE("Jawa Trade Language", true, true),
    KAMINOAN("Kamino", true, true),
    KEL_DOR("Kel Dor", true, true),
    LEKKU("Lekku", true, false),
    MON_CALAMARI("Mon Calamari", true, true),
    NEIMOIDIAN("Neimo", true, true),
    QUARRENESE("Quarrenese", true, true),
    RODESE("Rodese", true, true),
    RYL("Ryl", true, true),
    SITH("Sith", true, true),
    SHYRIIWOOK("Shyriiwook", true, false),
    SULLUSTESE("Sullustese", true, true),
    YUUZHAN_VONG("Yuuzhan Vong", true, true),
    ZABRACK("Zabrack", true, true);

    private final String language;
    private final boolean fluantLanguage;
    private final boolean literateLanguage;

    Language(String language, boolean fluentLanguage, boolean literateLanguage) {
        this.language = language;
        this.fluantLanguage = fluentLanguage;
        this.literateLanguage = literateLanguage;
    }
}
