package intro.di;

import intro.di.network.AuthService;

@motif.Scope
public interface LoggedInScope {

  AuthService authService();

}
