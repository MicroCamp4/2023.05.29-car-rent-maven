package pl.comarch.szkolenia.car.rent.auth;

import org.springframework.stereotype.Component;

//@Component
public class NewAuthenticator implements IAuthenticator  {
    @Override
    public boolean authenticate(String login, String password) {
        return false;
    }
}
