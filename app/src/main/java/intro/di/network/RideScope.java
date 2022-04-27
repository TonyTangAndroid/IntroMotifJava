package intro.di.network;

import intro.di.Profile;
import motif.Expose;

@motif.Scope
public interface RideScope {


    //add a new TripScope.
    //Will the code compile?
    TripScope tripScope();

    //builder pattern
    //This is helpful for any code reader instantly knows what is required to create the RideScope
    interface Builder {
        //Make the dynamic dependencies explicitly
        RideScope  rideScope(@Expose Profile profile);
    }

    //access method
    RideRequestService rideRequestService();

    //it is equivalent to dagger module.
    @motif.Objects
    abstract class Objects {

        //factory method. ->  abstract factory method.
         NetworkClient networkClient(){
            return new NetworkClient("url");
        }

        //motif factory method. --? dagger module provider.
        static RideRequestService service(Profile profile, NetworkClient networkClient) {
            return new RideRequestServiceImpl(profile, networkClient);
        }

    }
}