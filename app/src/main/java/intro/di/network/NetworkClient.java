package intro.di.network;

import javax.inject.Inject;

public class NetworkClient {

  //by default, if there is only one constructor, motif will use the only constructor.
  //Of all di concept, we must identify the one and only one path.

  //if there are two constructors, you have to inject the desired one.
  public NetworkClient() {
  }

  public NetworkClient(String x) {
  }

  public String newCall(String url) {
    return String.format("%s is ok", url);
  }
}