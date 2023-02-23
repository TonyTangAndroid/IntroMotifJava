package intro.di;

import dagger.Provides;
import intro.di.network.AuthService;

@dagger.Module
public abstract class TestModule {

  @Provides
  public static AuthService authService(){
    throw new RuntimeException();
  }
}
