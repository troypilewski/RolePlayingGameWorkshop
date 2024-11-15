package com.app.rpgws.source.sw.model;

import java.util.Map;

public class Species {
    private String name;
    private Map<Ability, Integer> speciesModifiers;

    public Species(String name, Map<Ability, Integer> speciesModifiers) {
        this.name = name;
        this.speciesModifiers = speciesModifiers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Ability, Integer> getSpeciesModifiers() {
        return speciesModifiers;
    }

    public void setSpeciesModifiers(Map<Ability, Integer> speciesModifiers) {
        this.speciesModifiers = speciesModifiers;
    }
}
