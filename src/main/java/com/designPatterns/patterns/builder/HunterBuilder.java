package com.designPatterns.patterns.builder;

/**
 * Concrete Builder for creating a hunters
 * @author Ihor Savchenko
 * @version 1.0
 */
public class HunterBuilder extends AbstractBuilder {

    private Character character;

    public void createCharacter(){
        character = new Character();
        character.setWeapon("bow");
        character.setArmor("leather");
        character.setSpeed("high");
        character.setStrength("middle");
        character.setAgility("high");
    }

    public Character getCharacter(){
        return this.character;
    }
}
