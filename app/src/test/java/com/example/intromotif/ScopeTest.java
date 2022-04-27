package com.example.intromotif;

import com.google.common.truth.Truth;

import org.junit.Test;

import intro.di.network.EmptyScope;
import intro.di.network.EmptyScopeImpl;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ScopeTest {
    @Test
    public void addition_isCorrect() {
        EmptyScope emptyScope = new EmptyScopeImpl();
        Truth.assertThat(emptyScope).isNotNull();
    }
}