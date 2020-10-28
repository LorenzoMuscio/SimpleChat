package chatProject.model.login;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AuthenticationTest {

    @Test
    public void getUsername() {

        final String username = "My user";
        final Authentication auth = new Authentication(username, "psw");

        assertEquals("The username should be the one set in the constructor",
                username, auth.getUsername());
    }

    @Test
    public void getPassword() {

        final String psw = "psw";
        final Authentication auth = new Authentication("My user", psw);

        assertEquals("The password should be the one set in the constructor",
                psw, auth.getPassword());
    }
}
