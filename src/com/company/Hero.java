package com.company;

public class Hero {
    private int heroHealth ;
    private int heroDamage ;
    private int heroSuperpower;

    public Hero(int heroHealth, int heroDamage, int heroSuperpower) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.heroSuperpower = heroSuperpower;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public int getHeroSuperpower() {
        return heroSuperpower;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }
}
