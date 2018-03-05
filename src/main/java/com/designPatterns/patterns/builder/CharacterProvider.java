package com.designPatterns.patterns.builder;

/**
 * Provider for creating process
 * @author Ihor Savchenko
 * @version 1.0
 */
public class CharacterProvider {

    public void createCharacter(AbstractBuilder abstractBuilder){

        abstractBuilder.createCharacter();
    }
}
