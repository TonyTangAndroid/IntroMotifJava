package com.example.intromotif;

import com.google.common.truth.Truth;

import org.junit.Test;

import intro.di.network.RootScope;
import intro.di.network.RootScopeImpl;
import intro.di.network.RideRequestService;
import intro.di.network.RideScope;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ScopeTest {

    @Test
    public void authenticationScope() {
        RootScope rootScope = new RootScopeImpl();
        Truth.assertThat(rootScope).isNotNull();

        RideScope rideScope = rootScope.rideScope(rootScope.profile());

        RideRequestService rideRequestService = rideScope.rideRequestService();

        //final request the ride.
        rideRequestService.requestRide();
    }
}