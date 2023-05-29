package pl.comarch.szkolenia.car.rent.database;

import org.springframework.stereotype.Repository;
import pl.comarch.szkolenia.car.rent.model.Car;

import java.util.List;

@Repository
public class CarRepository2 implements ICarRepository {
    @Override
    public boolean rentCar(String plate) {
        return false;
    }

    @Override
    public List<Car> getCars() {
        return null;
    }
}
