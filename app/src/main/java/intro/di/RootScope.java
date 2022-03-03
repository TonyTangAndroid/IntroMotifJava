package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;

@motif.Scope
interface RootScope {

  //Access method. 0
  AuthService authService();

  //factory method

  @motif.Objects
  abstract class Objects {

    //2. NetworkClient
    NetworkClient createNetworkClient() {
      return new NetworkClient();
    }

    //1
    AuthService AuthService(NetworkClient networkClient) {
      return new AuthServiceImpl(networkClient);
    }


  }
}