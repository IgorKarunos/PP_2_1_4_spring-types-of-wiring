package koschei.models;

public class Duck5 {

    private final Egg6 egg;

    public Duck5(Egg6 egg) {
        this.egg = egg;
    }

    @Override
    public String toString() {
        return "утка, в утке " + egg.toString();
    }
}