package intro.di.network;

import intro.di.Profile;

@motif.Scope
public interface TripScope {

    TripManager tripManager();

    @motif.Objects
    abstract class Objects {

        //For any objects, you always has to declare it under Objects class.
       abstract TripManager tripManager();
    }
}