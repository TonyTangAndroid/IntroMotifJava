package intro.di;

import intro.di.network.AuthService;

/**
 * Having a empty scope is a great start.
 * It means your code compiles
 * It means motif setup works.
 */
@motif.Scope
public interface RootScope {

  //expose
  AuthService authService();

  @motif.Objects
  abstract class Objects{
    static AuthService authService(){
      throw new RuntimeException();
    }
  }
}
