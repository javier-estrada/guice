package authentication;

import com.google.inject.AbstractModule;

/**
 * Class to configure authentication.
 */
public class AuthenticationModule extends AbstractModule {

    @Override
    public void configure() {
        bind(Authentication.class).to(AuthenticationImpl.class);
    }
}
