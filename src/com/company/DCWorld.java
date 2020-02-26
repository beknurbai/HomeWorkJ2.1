package com.company;

public class DCWorld {
    private String superHeroesName;
    private int speed;


    public String getSuperHeroesName() {
        return superHeroesName;
    }

    public DCWorld(String superHeroesName, int speed) {

        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
