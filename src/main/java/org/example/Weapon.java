package org.example;

public enum Weapon {
    SWORD(70, 0.5),
    GLOCK(60, 2.0),
    SHOTTY(100, 1.0);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
}
