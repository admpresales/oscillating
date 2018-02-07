package net.demo.login;

import org.junit.*;
import com.hp.lft.sdk.*;

import unittesting.*;

public class LoginTests extends UnitTestClassBase {

    public LoginTests() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new LoginTests();
        globalSetup(LoginTests.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void simpleEmailLogin() throws GeneralLeanFtException {
        System.out.println(">>>> running: "+new Object(){}.getClass().getEnclosingMethod().getName());
    }
    @Test
    public void forgotUsernameLogin() throws GeneralLeanFtException {
        System.out.println(">>>> running"+new Object(){}.getClass().getEnclosingMethod().getName());
    }
    @Test
    public void forgotPasswordLogin() throws GeneralLeanFtException {
        System.out.println(">>>> running"+new Object(){}.getClass().getEnclosingMethod().getName());
    }
    @Test
    public void simpleUsernameLogin() throws GeneralLeanFtException {
        System.out.println(">>>> running"+new Object(){}.getClass().getEnclosingMethod().getName());
    }

}