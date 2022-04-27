package intro.di.network;

public class NetworkClient {

  public NetworkClient() {
  }

  public String newCall(String url) {
    return String.format("%s is ok", url);
  }
}