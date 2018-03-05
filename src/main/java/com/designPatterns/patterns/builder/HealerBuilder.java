package com.designPatterns.patterns.builder;

/**
 * Concrete Builder for creating a healers
 * @author Ihor Savchenko
 * @version 1.0
 */
public class HealerBuilder extends AbstractBuilder {

    private Character character;

    public void createCharacter(){
        character = new Character();
        character.setWeapon("staff");
        character.setArmor("cloth");
        character.setSpeed("high");
        character.setStrength("low");
        character.setAgility("middle");
    }

    public Character getCharacter(){
        return this.character;
    }
}
