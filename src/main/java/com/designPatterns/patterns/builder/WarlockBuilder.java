package com.designPatterns.patterns.builder;

/**
 * Concrete Builder for creating a warlocks
 * @author Ihor Savchenko
 * @version 1.0
 */
public class WarlockBuilder extends AbstractBuilder {

    private Character character;

    public void createCharacter(){
        character = new Character();
        character.setWeapon("evil eye");
        character.setArmor("cloth");
        character.setSpeed("middle");
        character.setStrength("low");
        character.setAgility("high");
    }

    public Character getCharacter(){
        return this.character;
    }
}
