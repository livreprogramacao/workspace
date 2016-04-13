package com.tutorialspoint.parameterizedtests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class PrimeNumberCheckerTest {

    public PrimeNumberCheckerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of validate method, of class PrimeNumberChecker.
     */
    @Test
    public void testValidate() {
        System.out.println("validate");
        Integer primeNumber = null;
        PrimeNumberChecker instance = new PrimeNumberChecker();
        Boolean expResult = null;
        Boolean result = instance.validate(primeNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
