package com.company;

public class Main {

    public static void main(String[] args) {

        Superman superman1 = new Superman("Criptinitis", Weapon.SCORCHINGEYES,400,"Cont");
        superman1.getInfo();
        System.out.println(superman1.getInfo());
        Cripton cripton = new Cripton("Fly", Weapon.SCORCHINGEYES,Planets.EARTH,"lex",1000);
        System.out.println(cripton.getInfo());
        cripton.getInfo();

        Cripton cripton1 = new Cripton("SCORCHINGEYES", Weapon.FLY,Planets.CRIPTON,"Zod",1000);
        System.out.println(cripton1.getInfo());
        cripton1.getInfo();

        Cripton cripton3 = new Cripton(" ", Weapon.FLY,Planets.JUPITER,"Caluel",1500);
cripton3.getInfo();
    }
}