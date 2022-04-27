package intro.di.network;

import java.util.UUID;

import intro.di.Profile;

@motif.Scope
public interface AuthenticationScope {

    Profile profile();

    //child scope.
    //to create a ride scope, we need to satisfy the Profile requirement.
    //hence, we pass [Profile] as a parameter.
    //This parameter is called dynamic dependency.
    RideScope rideScope(Profile profile);


    @motif.Objects
    abstract class Objects {
        static Profile profile() {
            return new Profile(UUID.randomUUID(), "123");
        }

    }
}