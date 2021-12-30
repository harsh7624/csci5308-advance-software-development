package SRP;
import good.NotSubscribedUser;
import good.PremiumUser;
import org.junit.Test;

import static org.junit.Assert.*;

public class LSPSolutionTest {
    NotSubscribedUser normalUser = new NotSubscribedUser();
    PremiumUser premiumUser = new PremiumUser();

    @Test
    public void checkNormalUpdate(){
        assertEquals(true,normalUser.updateInfo("h@gmail.com"));
    }

    @Test
    public void checkNormalUpdate1(){
        assertFalse(normalUser.updateInfo("wrong@email.com"));
    }

    @Test
    public void checkPremiumUpdate(){
        assertEquals(true,premiumUser.updateInfo("h@gmail.com"));
    }

    @Test
    public void checkPremiumUpdate1(){
        assertFalse(premiumUser.updateInfo("wrong@email.com"));
    }

    @Test
    public void premiumContent(){
        assertEquals("success",premiumUser.watchContent());

    }
    @Test
    public void canComment(){
        assertEquals("success",premiumUser.canComment());

    }
}
