package pl.comarch.szkolenia.car.rent.database;

import pl.comarch.szkolenia.car.rent.model.User;

import java.util.Optional;

public interface IUserRepository {
    Optional<User> getUserByLogin(String login);
}
