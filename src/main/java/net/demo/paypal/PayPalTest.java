package net.demo.paypal;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import net.demo.LogMessages;
import org.junit.*;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class PayPalTest extends UnitTestClassBase {

    public PayPalTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new PayPalTest();
        globalSetup(PayPalTest.class);
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
    public void alwaysPassesPayPal() throws GeneralLeanFtException, ReportException {
        new LogMessages().logMethod(new Object(){});
        Reporter.reportEvent("PayPal  is good","", Status.Passed);
    }
    @Test
    public void alwaysFailsPayPal() throws GeneralLeanFtException {
        new LogMessages().logMethod(new Object(){});
       Verify.areEqual(9,10);
        
        //This will force the error as a Junit so it will propegate up to Octane
       //if (Reporter.getStatus() == Status.Failed){
       //     Assert.fail();
       //}
    }
    @Test
    public void alwaysThrowsExceptionPayPal() {
        new LogMessages().logMethod(new Object(){});
        //this will always throw an exception error and if not trapped
        //using a try/catch then it will stop the execution
        Assert.assertEquals(1,2);
    }
    @Test
    public void alwaysThrowsExceptionButCaughtPayPal() {
        new LogMessages().logMethod(new Object() {
        });
        try {
            Assert.assertEquals(1, 2);
        } catch (AssertionError e) {
            System.out.println("Error from Assert: " + e.toString());
        }
    }
}
