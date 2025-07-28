package koschei.models;

public class Island2 {

    private final Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }

    @Override
    public String toString() {
        return "остров, на острове " + wood.toString();
    }
}