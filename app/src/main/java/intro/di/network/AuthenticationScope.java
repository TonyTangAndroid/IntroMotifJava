package intro.di.network;

import java.util.UUID;

import intro.di.Profile;

@motif.Scope
public interface AuthenticationScope {

    Profile profile();


    @motif.Objects
    abstract class Objects {
        static Profile profile() {
            return new Profile(UUID.randomUUID(), "123");
        }

    }
}