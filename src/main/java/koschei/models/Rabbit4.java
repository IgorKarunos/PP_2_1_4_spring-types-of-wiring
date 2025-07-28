package koschei.models;

public class Rabbit4 {

    private final Needle7 needle;

    public Rabbit4(Needle7 needle) {
        this.needle = needle;
    }

    @Override
    public String toString() {
        return "заяц, в зайце " + needle.toString();
    }
}