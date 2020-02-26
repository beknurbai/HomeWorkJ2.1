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

    public Cripton(String superAbilities, Weapon weapon,Planets planets) {
        super(superAbilities, weapon);
this.planets=planets;

    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public void getInfo2() {
        Superman superman = new Superman("", Weapon.SCORCHINGEYES);
        this.abc = superman.getSuperAbilities();
        this.immunity = superman.getVulnerability();
    }

}

