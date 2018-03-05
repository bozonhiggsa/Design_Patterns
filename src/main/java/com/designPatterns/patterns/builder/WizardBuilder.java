package com.designPatterns.patterns.builder;

/**
 * Concrete Builder for creating a wizards
 * @author Ihor Savchenko
 * @version 1.0
 */
public class WizardBuilder extends AbstractBuilder {

    private Character character;

    public void createCharacter(){
        character = new Character();
        character.setWeapon("fairy tale");
        character.setArmor("cloth");
        character.setSpeed("high");
        character.setStrength("low");
        character.setAgility("middle");
    }

    public Character getCharacter(){
        return this.character;
    }
}
