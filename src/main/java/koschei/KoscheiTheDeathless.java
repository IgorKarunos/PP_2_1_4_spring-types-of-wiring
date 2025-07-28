package koschei;

import koschei.models.Duck5;
import koschei.models.Ocean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KoscheiTheDeathless {

    private final Duck5 duck5;
    private final Ocean1 ocean;

    @Autowired
    public KoscheiTheDeathless(Duck5 duck5, Ocean1 ocean) {
        this.duck5 = duck5;
        this.ocean = ocean;
    }

    public String getRulesByDeth() {
        return "На свете есть океан, " + ocean.toString() + ", в утке " + duck5.toString();
    }
}