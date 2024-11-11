package com.app.rpgws.source.sw.model;

import java.util.HashMap;
import java.util.Map;

public class Abilities {
    private Map<Ability, Integer[]> abilitiesMap;

    public Abilities(Map<Ability, Integer[]> abilitiesMap) {
        abilitiesMap = new HashMap<>();
        for (Ability ability : Ability.values()) {
            int score = 10;
            abilitiesMap.put(ability, new Integer[]{score, calculateModifier(score)});
        }
    }
    private int calculateModifier(int score) {
        return (score - 10) / 2;
    }
    public int getAbilityScore(Ability ability) {
        return abilitiesMap.get(ability)[0];
    }
    public int getAbilityModifier(Ability ability) {
        return abilitiesMap.get(ability)[1];
    }
    public void setAbilityScore(Ability ability, int score) {
        abilitiesMap.put(ability, new Integer[]{score, calculateModifier(score)});
    }
}
