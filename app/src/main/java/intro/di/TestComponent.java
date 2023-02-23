package intro.di;

import intro.di.network.AuthService;

@dagger.Component
public interface TestComponent {

  AuthService authService();

}
