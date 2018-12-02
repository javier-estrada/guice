package authentication;

import com.google.inject.Inject;

public class AuthenticationService {

    private final Authentication authentication;

    @Inject
    public AuthenticationService(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * Authenticate if username is valid
     * @param username to authenticate.
     */
    public void authenticateUser(String username) {
        System.out.println(authentication.isValidUser(username));
    }
}
