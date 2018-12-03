package authentication;

import com.google.inject.testing.fieldbinder.BoundFieldModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AuthenticationServiceTest {

    @Inject private AuthenticationService authenticationService;

    @Before
    public void setUp() {
        Guice.createInjector(BoundFieldModule.of(this), new AuthenticationModule()).injectMembers(this);
    }

    @Test
    public void testAuthenticateUser_whenIsValid() {
        authenticationService.authenticateUser("");
    }
}
