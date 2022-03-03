package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import intro.di.network.RideRequestService;
import intro.di.network.RideRequestServiceImpl;
import motif.Expose;
import motif.Scope;

@Scope
interface RootScope extends LoggedInScope.Builder {
    AuthService authService();


    @motif.Objects
    abstract class Objects {
        @Expose
        NetworkClient networkClient()  {
            return new NetworkClient();
        }

        AuthService authService(NetworkClient networkClient )  {
            return new AuthServiceImpl(networkClient);
        }
    }
}