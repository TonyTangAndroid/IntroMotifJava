package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;

class RootComponent {
    private NetworkClient networkClient = null;
    private RideRequestService rideRequestService = null;


    AuthService authService() {
        NetworkClient networkClient2 = networkClient();
        return new AuthServiceImpl(networkClient2);
    }

    RideRequestService rideRequestService(Profile profile) {
        if (rideRequestService == null) {
            NetworkClient networkClient1 = networkClient();
            rideRequestService = new RideRequestServiceImpl(profile, networkClient1);
        }
        return rideRequestService;
    }

    NetworkClient networkClient() {
        if (networkClient == null) {
            networkClient = new NetworkClient();
        }
        return networkClient;
    }
}