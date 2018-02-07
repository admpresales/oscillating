package net.demo;

import static org.junit.Assert.*;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import org.junit.*;
import com.hp.lft.sdk.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class StableTests extends UnitTestClassBase {

    public StableTests() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new StableTests();
        globalSetup(StableTests.class);
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
    public void alwaysPasses() throws GeneralLeanFtException, ReportException {
        System.out.println(">>>> running: "+new Object(){}.getClass().getEnclosingMethod().getName());
        Reporter.reportEvent("Always Passes","<h1>Your faborite test</h1>", Status.Passed);
    }

    @Ignore("Not ready yet") @Test
    public void skippedTest () throws GeneralLeanFtException{
        System.out.println(">>>> running: "+new Object(){}.getClass().getEnclosingMethod().getName());
    }
}