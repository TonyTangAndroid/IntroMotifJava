package intro.di;

import intro.di.network.AuthService;

@motif.Scope
interface RootScope {
  //Access method.
  AuthService authService();
}