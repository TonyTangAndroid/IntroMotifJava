package intro.di.network;

import java.util.UUID;

import intro.di.Profile;

public class AuthServiceImpl implements AuthService {
    private final NetworkClient networkClient;

    public AuthServiceImpl(NetworkClient networkClient) {
        this.networkClient = networkClient;
    }

    @Override
    public Profile login(String email, String password) {
        networkClient.newCall("www.example.com/login?email=$email&password=$password");
        return new Profile(UUID.randomUUID(), "xxxx-xxxx-xxxx");
    }
}