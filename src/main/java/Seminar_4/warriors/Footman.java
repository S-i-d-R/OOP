package Seminar_4.warriors;

import Seminar_4.shields.Shield;
import Seminar_4.weapons.MeleeWeapon;

public class Footman<S extends Shield> extends Warrior {
    MeleeWeapon weapon;

    S shield = null;

    public Footman(String name, int health, MeleeWeapon weapon) {
        super(name, health);
        this.weapon = weapon;
    }

    public Footman(String name, int health, MeleeWeapon weapon, S shield) {
        super(name, health);
        this.weapon = weapon;
        this.shield = shield;
    }

    public MeleeWeapon getWeapon() {
        return weapon;
    }

    @Override
    public S getShield() {
        return shield;
    }

    @Override
    public boolean hasShield() {
        return shield != null;
    }

    @Override
    public String toString() {
        return String.format("Пехотинец%s Оружие: %s", super.toString(), weapon) +
                (shield != null ? " " + shield : "");
    }
}