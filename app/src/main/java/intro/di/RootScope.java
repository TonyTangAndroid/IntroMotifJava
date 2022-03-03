package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import motif.Expose;

@motif.Scope
interface RootScope extends LoggedInScope.Builder {

  //Access method. 0
  AuthService authService();

  @motif.Objects
  abstract class Objects {

    //2. NetworkClient   //factory method
    @Expose
    NetworkClient createNetworkClient() {
      return new NetworkClient();
    }

    //1   //factory method
    AuthService AuthService(NetworkClient networkClient, String serverUl) {
      return new AuthServiceImpl(serverUl, networkClient);
    }

  }


}