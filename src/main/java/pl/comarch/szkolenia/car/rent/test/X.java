package pl.comarch.szkolenia.car.rent.test;

import org.springframework.beans.factory.annotation.Autowired;
import pl.comarch.szkolenia.car.rent.gui.GUI;

public class X {
    C c;

    public X(@Autowired C c) {
        c.setGui(new GUI());
        this.c = c;
    }
}
