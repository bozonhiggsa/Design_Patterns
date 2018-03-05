package com.designPatterns.patterns.builder;

/**
 * Character that has many features
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Character {

    private String weapon;
    private String armor;
    private String speed;
    private String agility;
    private String strength;

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void setAgility(String agility) {
        this.agility = agility;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Character{" +
                "weapon='" + weapon + '\'' +
                ", armor='" + armor + '\'' +
                ", speed='" + speed + '\'' +
                ", agility='" + agility + '\'' +
                ", strength='" + strength + '\'' +
                '}';
    }
}
