package com.example.intromotif;

import com.google.common.truth.Truth;

import org.junit.Test;

import intro.di.Profile;
import intro.di.network.AuthenticationScope;
import intro.di.network.AuthenticationScopeImpl;
import intro.di.network.RideRequestService;
import intro.di.network.RideScope;
import intro.di.network.RideScopeImpl;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ScopeTest {

    @Test
    public void authenticationScope() {
        AuthenticationScope authenticationScope = new AuthenticationScopeImpl();
        Truth.assertThat(authenticationScope).isNotNull();

        Profile profile = authenticationScope.profile();
        RideScope rideScope = authenticationScope.rideScope(profile);

        RideRequestService rideRequestService = rideScope.rideRequestService();

        //final request the ride.
        rideRequestService.requestRide();
    }
}