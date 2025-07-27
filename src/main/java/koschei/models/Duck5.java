package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {

    private final Egg6 egg;

    @Autowired
    public Duck5(Needle7 needle) {
        this.egg = new Egg6(needle);
    }

    @Override
    public String toString() {
        return "утка , в утке " + egg.toString();
    }
}