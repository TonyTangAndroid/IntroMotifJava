package intro.di;

import intro.di.network.AuthService;
import intro.di.network.AuthServiceImpl;
import intro.di.network.NetworkClient;
import motif.Expose;

/**
 * Having a empty scope is a great start. It means your code compiles It means motif setup works.
 */
@motif.Scope
public interface RootScope extends LoggedInScope.Builder{


  LoggedOutScope loggedOutScope();

  //2 access method.
  AuthService authService();

  @motif.Objects
  abstract class Objects {

    //1,  factory method.
    @Expose
    AuthService authService(NetworkClient networkClient) {
      return new AuthServiceImpl(networkClient);
    }

    //3, abstract factory method.
    // it will use its default constructor to create the instance.
    @Expose
    abstract NetworkClient networkClient();
  }
}
