package intro.di;

import intro.di.network.AuthService;

@dagger.Component(modules = TestModule.class)
public interface TestComponent {

  AuthService authService();

}
