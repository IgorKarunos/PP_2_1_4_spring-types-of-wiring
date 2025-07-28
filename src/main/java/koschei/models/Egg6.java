package koschei.models;

public class Egg6 {

    private final Deth8 death;

    public Egg6(Deth8 death) {
        this.death = death;
    }

    @Override
    public String toString() {
        return "в яйце игла, " + death.toString();
    }
}