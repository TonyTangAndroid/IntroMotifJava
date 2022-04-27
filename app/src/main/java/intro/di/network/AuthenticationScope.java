package intro.di.network;

import java.util.UUID;

import intro.di.Profile;
import motif.Expose;

@motif.Scope
public interface AuthenticationScope {

    Profile profile();

    //child scope.
    //to create a ride scope, we need to satisfy the Profile requirement.
    //hence, we pass [Profile] as a parameter.
    //This parameter is called dynamic dependency.
    RideScope rideScope();


    @motif.Objects
    abstract class Objects {

        //by default, motif objects/dependencies are only accessible within its own current scope.
        //if you want to expose it to its children, you need to annotate it with @Expose
        @Expose
        static Profile profile() {

            return new Profile(UUID.fromString("65221c38-3e45-4bf7-9f9f-b46c7a8e35e4"), "123");
        }

    }
}