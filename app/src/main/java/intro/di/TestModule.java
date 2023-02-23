package intro.di;

import dagger.Provides;
import intro.di.network.AuthService;

@dagger.Module
public abstract class TestModule {

  /**
   * Both Motif and Dagger are compile safety.
   * But it does not check run time exceptions.
   * Hence, you could use `throw new RuntimeException();` to divide and conque your task.
   */
  @Provides
  public static AuthService authService(){
    throw new RuntimeException();
  }
}
