package com.company;

public class Superman extends DCWorld {
    public String getVulnerability() {
        return vulnerability;
    }

    private String vulnerability;


    public Superman(String vulnerability) {
        super("Superman",1000);

        this.vulnerability = vulnerability
        ;
    }

    private String SuperAbilities;
    private Weapon weapon;


    public String getSuperAbilities() {
        return SuperAbilities;
    }

    public Weapon getWeapon() {

        return weapon;
    }

    public Superman(String superAbilities, Weapon weapon) {
        super("Superman",400);
        SuperAbilities = superAbilities;
        this.weapon = weapon;
    }
    public void makeLaser(String eyeLaser){
        System.out.println(eyeLaser);

    }
    public final void makeLaser(int eye){
        for (int i = 0; i <eye ; i++) {
            System.out.println("лазер из глаза"+i);
        }
    }



    public String  getInfo() {

        return "Info " + weapon + SuperAbilities + vulnerability;

    }




    }

