package ngdemo.rest;

import ngdemo.dao.PlayerDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.BootstrapWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContextBootstrapper;

import java.lang.reflect.Field;

/**
 * @author Michał Mela
 */
@RunWith(org.springframework.test.context.junit4.SpringJUnit4ClassRunner.class)
@BootstrapWith(TestContextBootstrapper.class)
@ContextConfiguration(locations = "classpath:**/mvc-dispatcher-servlet.xml")
public class LoginRestServiceTest {

    @Autowired
    LoginRestService lrs;

    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException {
        Field playerDAOField = lrs.getClass().getField("playerDAO");
        PlayerDAO playerDAO = (PlayerDAO) playerDAOField.get(lrs);
        assert playerDAO != null;
        System.out.println(lrs.playerDAO);
    }

}