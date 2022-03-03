package intro.di.network;

import intro.di.Profile;

public class RideRequestServiceImpl implements
    RideRequestService {

    private final Profile profile;
    private final NetworkClient networkClient;

    public RideRequestServiceImpl(Profile profile, NetworkClient networkClient) {
        this.profile = profile;
        this.networkClient = networkClient;
    }

    @Override
    public void requestRide() {
        networkClient.newCall("www.example.com/request?token=" + profile.authToken());
    }
}