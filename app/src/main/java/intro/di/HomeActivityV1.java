package intro.di;

class HomeActivityV1 {

  private Profile profile;
  private RootComponent rootComponent;

  public HomeActivityV1( ) {
   }

  void onCreate() {
    rootComponent = new RootComponent();
  }

  /**
   * Login the user.
   *//**/
  void login() {
    profile = rootComponent.authService().login("eric.liu@uber.com", "xxxx");
  }

  /**
   * Request a ride.
   */
  void requestRide() {
    if (profile != null) {
      rootComponent.rideRequestService(profile).requestRide();
    }
  }
}