package intro.di.network;

import javax.inject.Inject;

public class NetworkClient {


  public NetworkClient() {

  }

  @Inject
  public NetworkClient(String serverUrl) {

  }

  public String newCall(String url) {
    return String.format("%s is ok", url);
  }
}