package pl.comarch.szkolenia.car.rent.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.comarch.szkolenia.car.rent.auth.Authenticator;
import pl.comarch.szkolenia.car.rent.auth.IAuthenticator;
import pl.comarch.szkolenia.car.rent.core.Core;
import pl.comarch.szkolenia.car.rent.core.ICore;

@Configuration
@ComponentScan("pl.comarch.szkolenia.car.rent")
public class AppConfiguration {

    /*@Bean
    public ICore core(IAuthenticator authenticator) {
        Core core = new Core(authenticator);
        core.setAuthenticator(authenticator);
        return core;
    }

    @Bean
    public IAuthenticator authenticator() {
        return new Authenticator();
    }*/
}
