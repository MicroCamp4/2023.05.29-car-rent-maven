package pl.comarch.szkolenia.car.rent.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.auth.IAuthenticator;
import pl.comarch.szkolenia.car.rent.database.ICarRepository;
import pl.comarch.szkolenia.car.rent.gui.GUI;
import pl.comarch.szkolenia.car.rent.gui.IGUI;
import pl.comarch.szkolenia.car.rent.model.User;

@Component
public class Core implements ICore {
    @Autowired
    private IGUI gui;
    @Autowired
    ICarRepository carRepository;
    @Autowired
    IAuthenticator authenticator;

    @Override
    public void start() {
        String choose = "3";
        for(int i = 0; i < 3; i++) {
            User user = this.gui.readAuthData();
            boolean authResult = this.authenticator.authenticate(user.getLogin(),
                    user.getPassword());
            if(authResult) {
                choose = "";
                break;
            }
        }
        while(!"3".equals(choose)) {
            switch (choose = this.gui.showMenu()) {
                case "1":
                    this.gui.listCars(this.carRepository.getCars());
                    break;
                case "2":
                    this.gui.showRentResult(this.carRepository.rentCar(this.gui.getPlate()));
                    break;
                case "3":
                    break;
                default:
                    System.out.println("Wrong choose !!!");
                    break;
            }
        }
    }
}
