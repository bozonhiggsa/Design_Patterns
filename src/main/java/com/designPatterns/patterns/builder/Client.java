package com.designPatterns.patterns.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Client that use a characters
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Client {

    final static CharacterProvider characterProvider = new CharacterProvider();
    private static final Logger logger = LoggerFactory.getLogger(Client.class);
    static AbstractBuilder builder;

    public static void main(String[] args) {

        builder = AbstractBuilder.getInstance(KindOfCharacter.HEALER);
        characterProvider.createCharacter(builder);
        logger.info(builder.getCharacter().toString());

        builder = AbstractBuilder.getInstance(KindOfCharacter.WARRIOR);
        characterProvider.createCharacter(builder);
        logger.info(builder.getCharacter().toString());

        builder = AbstractBuilder.getInstance(KindOfCharacter.HUNTER);
        characterProvider.createCharacter(builder);
        logger.info(builder.getCharacter().toString());

        builder = AbstractBuilder.getInstance(KindOfCharacter.WARLOCK);
        characterProvider.createCharacter(builder);
        logger.info(builder.getCharacter().toString());

        builder = AbstractBuilder.getInstance(KindOfCharacter.WIZARD);
        characterProvider.createCharacter(builder);
        logger.info(builder.getCharacter().toString());

    }

}
