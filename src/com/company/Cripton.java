package com.company;

public final class Cripton extends Superman {
    private String immunity;
    String abc;

    public String getImmunity() {
        return immunity;
    }

    public Cripton(String superAbilities, Weapon weapon) {
        super(superAbilities, weapon);


    }

    @Override
    public String getInfo(String name) {
        return super.getInfo(name);
    }

    public void getInfo2() {
        Superman superman = new Superman("", Weapon.SCORCHINGEYES);
        this.abc = superman.getSuperAbilities();
        this.immunity = superman.getVulnerability();
    }

}

