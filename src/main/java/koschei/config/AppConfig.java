package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Deth8 death() {
        return new Deth8();
    }

    @Bean
    public Needle7 needle7(Deth8 death) {
        return new Needle7(death);
    }

    @Bean
    public Rabbit4 rabbit4(Needle7 needle7) {
        return new Rabbit4(needle7);
    }

    @Bean
    public Wood3 wood3(Rabbit4 rabbit4) {
        return new Wood3(rabbit4);
    }

    @Bean
    public Island2 island2(Wood3 wood3) {
        return new Island2(wood3);
    }

    @Bean
    public Ocean1 ocean1(Island2 island2) {
        return new Ocean1(island2);
    }

    @Bean
    public Egg6 egg6(Deth8 death) {
        return new Egg6(death);
    }

    @Bean
    public Duck5 duck5(Egg6 egg6) {
        return new Duck5(egg6);
    }

    @Bean
    public KoscheiTheDeathless koscheiTheDeathless(Duck5 duck5, Ocean1 ocean1) {
        return new KoscheiTheDeathless(duck5, ocean1);
    }
}