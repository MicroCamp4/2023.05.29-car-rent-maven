package pl.comarch.szkolenia.car.rent.auth;

public interface IAuthenticator {
    boolean authenticate(String login, String password);
}
