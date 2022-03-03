package intro.di;

import java.util.UUID;

public class Profile {

    private final UUID uuid;
    private final String authToken;

    public Profile(UUID uuid, String authToken) {
        this.uuid = uuid;
        this.authToken = authToken;
    }

     public String authToken() {
        return authToken;
    }
}
