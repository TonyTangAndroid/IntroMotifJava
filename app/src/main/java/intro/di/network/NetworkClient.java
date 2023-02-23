package intro.di.network;

import javax.inject.Inject;

public class NetworkClient {


  public String newCall(String url) {
    return String.format("%s is ok", url);
  }
}