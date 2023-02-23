package com.example.intromotif;

import static com.google.common.truth.Truth.*;
import static com.google.common.truth.Truth.assertThat;

import com.google.common.truth.Truth;
import intro.di.RootScope;
import intro.di.RootScopeImpl;
import intro.di.network.AuthService;
import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

  @Test
  public void addition_isCorrect() {
    RootScope rootScope = new RootScopeImpl();
    assertThat(rootScope).isNotNull();
    AuthService authService1 = rootScope.authService();
    AuthService authService2 = rootScope.authService();

    assertThat(authService1 == authService2).isFalse();
    assertThat(authService1).isEqualTo(authService2);

  }

  @Test
  public void addition_isCorrectx() {
    RootScope rootScope1 = new RootScopeImpl();
    RootScope rootScope2 = new RootScopeImpl();
    AuthService authService1 = rootScope1.authService();
    AuthService authService2 = rootScope2.authService();

    assertThat(authService1 == authService2).isFalse();

  }
}