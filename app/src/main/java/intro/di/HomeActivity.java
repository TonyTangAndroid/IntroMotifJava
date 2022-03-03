package intro.di;

class HomeActivity {
    private Profile profile;
    private RootScope rootScope;

    public HomeActivity(Profile profile) {
        this.profile = profile;
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