package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss(50,25,"Магическая защита");
        System.out.println("Здоровья:" + boss.getBossHealth() + "\nУрон:"
                + boss.getBossDamage() + "\nТип защиты:" + boss.getBossDefence());
    }
}
