package pl.comarch.szkolenia.car.rent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.comarch.szkolenia.car.rent.configuration.AppConfiguration;
import pl.comarch.szkolenia.car.rent.core.ICore;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfiguration.class);
        ICore core = context.getBean(ICore.class);
        core.start();
    }
}
