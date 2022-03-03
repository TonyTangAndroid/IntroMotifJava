package intro.di.network;

import java.util.UUID;

import intro.di.Profile;

public class AuthServiceImpl implements AuthService {
    private final String serverUl;
    private final NetworkClient networkClient;

    public AuthServiceImpl(String serverUl, NetworkClient networkClient) {
        this.serverUl = serverUl;
        this.networkClient = networkClient;
    }

    @Override
    public Profile login(String email, String password) {
        networkClient.newCall("www.example.com/login?email=$email&password=$password");
        return new Profile(UUID.randomUUID(), "xxxx-xxxx-xxxx");
    }

    @Override
    public void logout(String email) {
        System.out.println("logged out");
    }
}