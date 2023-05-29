package pl.comarch.szkolenia.car.rent.gui;

import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.model.Car;
import pl.comarch.szkolenia.car.rent.model.User;

import java.util.List;
import java.util.Scanner;

@Component
public class GUI implements IGUI {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String showMenu() {
        System.out.println("1. List Cars");
        System.out.println("2. Rent Car");
        System.out.println("3. Exit");
        return this.scanner.nextLine();
    }

    @Override
    public void listCars(List<Car> cars) {
        for(Car car : cars) {
            System.out.println(car);
        }
    }

    @Override
    public String getPlate() {
        System.out.println("Plate:");
        return this.scanner.nextLine();
    }

    @Override
    public void showRentResult(boolean result) {
        System.out.println(result ? "Success !!!" : "Error !!!");
    }

    @Override
    public User readAuthData() {
        System.out.println("Login:");
        String login = this.scanner.nextLine();
        System.out.println("Password:");
        return new User(login, this.scanner.nextLine());
    }
}
