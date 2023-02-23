package intro.di.network;

import javax.inject.Inject;

public class NetworkClient {

  @Inject
  public NetworkClient() {

  }

  public NetworkClient(String serverUrl) {

  }
  public String newCall(String url) {
    return String.format("%s is ok", url);
  }
}