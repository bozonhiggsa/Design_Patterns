package com.designPatterns.patterns.builder;

/**
 * Concrete Builder for creating a warriors
 * @author Ihor Savchenko
 * @version 1.0
 */
public class WarriorBuilder extends AbstractBuilder{

    private Character character;

    public void createCharacter(){
        character = new Character();
        character.setWeapon("axe");
        character.setArmor("metal");
        character.setSpeed("low");
        character.setStrength("high");
        character.setAgility("middle");
    }

    public Character getCharacter(){
        return this.character;
    }
}
