package intro.di.network;

import javax.inject.Inject;

import intro.di.Profile;

public class TripManager {

    private Profile profile;

    public TripManager(Profile profile) {
        this.profile = profile;
    }
}