package com.company;

public class Main {

    public static void main(String[] args) {

        Superman superman1 = new Superman("Criptinitis", Weapon.SCORCHINGEYES);
        System.out.println(superman1);
        superman1.getInfo();

        Cripton cripton = new Cripton("Fly", Weapon.SCORCHINGEYES);
        System.out.println(cripton);
        cripton.getInfo();

        Cripton cripton1 = new Cripton("SCORCHINGEYES", Weapon.FLY);
        System.out.println(cripton1);
        cripton1.getInfo();

        Cripton cripton3 = new Cripton(" ", Weapon.FLY);
cripton3.getInfo2();
    }
}