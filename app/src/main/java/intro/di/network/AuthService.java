package intro.di.network;

import intro.di.Profile;

public interface AuthService {
    Profile login(String email, String password);
    void logout(String email);
}