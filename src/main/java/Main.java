import authentication.AuthenticationModule;
import authentication.AuthenticationService;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AuthenticationModule());

        AuthenticationService authenticationService = injector.getInstance(AuthenticationService.class);

        authenticationService.authenticateUser("javo");
    }
}
