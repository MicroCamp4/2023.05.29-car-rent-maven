package pl.comarch.szkolenia.car.rent.database;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.comarch.szkolenia.car.rent.model.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository implements IUserRepository {
    private final Map<String, User> users = new HashMap<>();

    public UserRepository() {
        this.users.put("admin",
                new User("admin", "0441880c178f0e4b0239c6bb3fe40412"));
        this.users.put("janusz",
                new User("janusz", "7413b5c0622006c3bb704c9c16d66110"));
    }

    @Override
    public Optional<User> getUserByLogin(String login) {
        User user = this.users.get(login);
        if(user == null) {
            return Optional.empty();
        }
        return Optional.of(user);
    }
}
