package com.example.intromotif;

import com.google.common.truth.Truth;

import org.junit.Test;

import intro.di.Profile;
import intro.di.network.RideScope;
import intro.di.network.RideScopeImpl;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ScopeTest {
    @Test
    public void addition_isCorrect() {
        RideScope rideScope = new RideScopeImpl(new RideScopeImpl.Dependencies() {
            @Override
            public Profile profile() {
                return null;
            }
        });
        Truth.assertThat(rideScope).isNotNull();
    }
}