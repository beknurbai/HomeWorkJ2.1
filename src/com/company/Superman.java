package com.company;

public class Superman extends DCWorld {
    public String getVulnerability() {
        return vulnerability;
    }

    private String vulnerability;


    public Superman(String vulnerability) {

        this.vulnerability = vulnerability
        ;
    }

    private String SuperAbilities;
    private Weapon weapon;

    public String getSuperAbilities() {
        return SuperAbilities;
    }

    public Weapon getWeapon() {
        weapon = Weapon.SCORCHINGEYES;
        weapon = Weapon.FLY;
        return weapon;
    }

    public Superman(String superAbilities, Weapon weapon) {
        SuperAbilities = superAbilities;
        this.weapon = weapon;
    }


    public String getInfo(String name) {
        System.out.println("Info " + weapon + SuperAbilities + vulnerability);
        return name;

    }

    final public void getInfo() {
        System.out.println("Info " + weapon + SuperAbilities + vulnerability);


    }
}
