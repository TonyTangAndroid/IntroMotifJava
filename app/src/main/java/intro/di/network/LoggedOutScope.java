package intro.di.network;

import intro.di.Profile;
import motif.Expose;

@motif.Scope
public interface LoggedOutScope {


    @motif.Objects
    abstract class Objects {


        abstract LoggedOutManager LoggedOutManager();

    }
}