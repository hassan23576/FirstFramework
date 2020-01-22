package home;

import common.CommonAPI;
import org.testng.annotations.Test;

public class HomeTest extends CommonAPI {

    @Test
    public void testUserCanLogInSuccessfully() {
        driver.get("http://facebook.com");
        HomePage hp = new HomePage();
        hp.logIn("finestb0y01@aol.com", "test");

    }

}
