package com.example.intromotif;

import com.google.common.truth.Truth;

import org.junit.Test;

import intro.di.Profile;
import intro.di.network.NetworkClient;
import intro.di.network.RootScope;
import intro.di.network.RootScopeImpl;
import intro.di.network.RideRequestService;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ScopeTest {
    @Test
    public void addition_isCorrect() {
        RootScope rootScope = new RootScopeImpl(new RootScopeImpl.Dependencies() {
            @Override
            public Profile profile() {
                return null;
            }

            @Override
            public NetworkClient networkClient() {
                return null;
            }


        });
        Truth.assertThat(rootScope).isNotNull();
    }
}