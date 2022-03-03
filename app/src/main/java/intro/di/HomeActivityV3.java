package intro.di;

class HomeActivityV3 {
    private Profile profile;
    private RootScope rootScope;

    public HomeActivityV3() {
    }

    void onCreate() {
        rootScope = new RootScopeImpl();
    }

    /**
     * Login the user.
     *//**/
    void login() {
        profile = rootScope.authService().login("eric.liu@uber.com", "xxxx");
    }

    /**
     * Request a ride.
     */
    void requestRide() {
        if (profile != null) {
            rootScope.loggedInScope(profile).rideRequestService().requestRide();
        }
    }
}