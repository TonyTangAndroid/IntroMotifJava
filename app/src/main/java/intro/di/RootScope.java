package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;

@motif.Scope
interface RootScope {

  //Access method. 0
  AuthService authService();


  @motif.Objects
  abstract class Objects {

    //2. NetworkClient   //factory method
    NetworkClient createNetworkClient() {
      return new NetworkClient();
    }

    //1   //factory method
    AuthService AuthService(NetworkClient networkClient) {
      return new AuthServiceImpl(networkClient);
    }

  }
}