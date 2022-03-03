package intro.di.network;

import javax.inject.Inject;

public class PriductService {

    public PriductService(NetworkClient networkClient) {
    }

    @Inject
    public PriductService(NetworkClient networkClient, String xxx) {
    }
}