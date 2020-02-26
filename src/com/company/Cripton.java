package com.company;

public final class Cripton extends Superman {
    private String immunity;
    String abc;
    private Planets planets;

    public Planets getPlanets() {
        return planets;
    }

    public String getImmunity() {
        return immunity;
    }

    public Cripton(String superAbilities, Weapon weapon,Planets planets, String SuperHeroesName,int speed ) {
        super(superAbilities, weapon,speed,SuperHeroesName );
this.planets=planets;

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }


    }


