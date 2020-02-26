package com.company;

public class Superman extends DCWorld {
    public String getVulnerability() {
        return vulnerability;
    }

    private String vulnerability;


    public Superman(String vulnerability, Weapon scorchingeyes, Been earth) {
        super("Superman",1000);

        this.vulnerability = vulnerability
        ;
    }

    private String SuperAbilities;
    private Weapon weapon;
Been been=new Been(Planets.CRIPTON);

    public String getSuperAbilities() {
        return SuperAbilities;
    }

    public Weapon getWeapon() {

        return weapon;
    }

    public Superman(String superAbilities, Weapon weapon,String SuperHeroesName,int speed ) {
        super(SuperHeroesName,speed);
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
       // System.out.println(getInfo());
        return "Info "+" "+super.getSuperHeroesName()+" "+super.getSpeed()+" " + weapon+" " + SuperAbilities + " "+ vulnerability+" "+been.getPlanets();
    }




    }

