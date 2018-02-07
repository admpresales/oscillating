package net.demo;

import static org.junit.Assert.*;

import com.hp.lft.report.ReportException;
import com.hp.lft.report.Reporter;
import com.hp.lft.report.Status;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
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
    public void testPayPal() throws GeneralLeanFtException, ReportException {
        Reporter.reportEvent("PayPal  is good","", Status.Passed);
    }

}