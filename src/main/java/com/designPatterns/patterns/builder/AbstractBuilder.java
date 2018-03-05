package com.designPatterns.patterns.builder;

/**
 * AbstractBuilder for creating a characters
 * @author Ihor Savchenko
 * @version 1.0
 */
public abstract class AbstractBuilder {

    public static AbstractBuilder getInstance(KindOfCharacter kindOfCharacter){

        AbstractBuilder builder = null;
        switch(kindOfCharacter){
            case WARRIOR:
                builder = new WarriorBuilder();
                break;
            case HUNTER:
                builder = new HunterBuilder();
                break;
            case WIZARD:
                builder = new WizardBuilder();
                break;
            case HEALER:
                builder = new HealerBuilder();
                break;
            case WARLOCK:
                builder = new WarlockBuilder();
                break;
        }
        return builder;

    }

    public abstract void createCharacter();

    public abstract Character getCharacter();

}
