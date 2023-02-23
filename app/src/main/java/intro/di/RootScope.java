package intro.di;

import intro.di.network.AuthService;

/**
 * Having a empty scope is a great start.
 * It means your code compiles
 * It means motif setup works.
 */
@motif.Scope
public interface RootScope {

  //2 access method.
  AuthService authService();

  @motif.Objects
  abstract class Objects{
    //1, factory method.
    static AuthService authService(){
      throw new RuntimeException();
    }
  }
}
