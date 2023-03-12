package Seminar_4.shields;

public class HeavyShield extends Shield {
    public HeavyShield(int defence) {
        super(defence, 0.75);
    }

    @Override
    public String toString() {
        return String.format("Тяжёлый%s", super.toString());
    }
}