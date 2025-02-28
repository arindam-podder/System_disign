package com.arindam.lld_soliddesignpattern.Design_Pattern.structural.flyweight;

public class Bullet implements FiringBullet{
    // Intrinsic (shared) state
    private final String type;
    private final String color;
    private final int speed;
    private final int damage;

    public Bullet(String type, String color, int speed, int damage) {
        this.type = type;
        this.color = color;
        this.speed = speed;
        this.damage = damage;
    }

    //here in fire x,y position is extrinsic state
    @Override
    public void fire(int x, int y) {
        System.out.println("Firing " + type + " Bullet | Color: " + color + " | Speed: " + speed +
                " | Damage: " + damage + " | Position: (" + x + ", " + y + ")");
    }

}
