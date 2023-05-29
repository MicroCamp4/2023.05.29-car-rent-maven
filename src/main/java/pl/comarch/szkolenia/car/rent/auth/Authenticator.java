package pl.comarch.szkolenia.car.rent.auth;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.comarch.szkolenia.car.rent.database.IUserRepository;
import pl.comarch.szkolenia.car.rent.database.UserRepository;
import pl.comarch.szkolenia.car.rent.model.User;

import java.util.Optional;

@Component
public class Authenticator implements IAuthenticator {
    @Autowired
    IUserRepository userRepository;

    private final String seed = "D4@af!CvYAFx*927Mk*uZ0gC1%fgREqF";

    @Override
    public boolean authenticate(String login, String password) {
        Optional<User> userBox = userRepository.getUserByLogin(login);
        return userBox.isPresent() &&
                userBox.get().getPassword().equals(DigestUtils.md5Hex(password + this.seed));
    }
}
