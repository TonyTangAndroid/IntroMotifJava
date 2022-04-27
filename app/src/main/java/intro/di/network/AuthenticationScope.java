package intro.di.network;

import intro.di.Profile;

@motif.Scope
public interface AuthenticationScope {

    Profile profile();


}