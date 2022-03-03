package intro.di;

import intro.di.network.NetworkClient;
import intro.di.network.PriductService;

@motif.Scope
interface RequestScope {

  intro.di.network.PriductService priductService();

  //Profile

  @motif.Objects
  abstract class Objects {

    public PriductService PriductService( NetworkClient networkClient) {
      return new PriductService(networkClient);
    }


  }
}