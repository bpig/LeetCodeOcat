class JunitIn60Secs {
    /**
     * @Test Mark your test cases with@Test annotations.
     * You don't need to prefix your test cases with "test".
     * In addition, your class does not need to extend from TestCase class.
     */
    @Test
    public void addition() {
        assertEquals(12, simpleMath.add(7, 5));
    }

    @Test
    public void subtraction() {
        assertEquals(9, simpleMath.substract(12, 3));
    }

    /**
     * @Before and @After
     * Use @Before and @After annotations for ��setup��and��tearDown��
     * methods respectively
     * They run before and after every test case.
     */
    @Before
    public void runBeforeEveryTest() {
        simpleMath = new SimpleMath();
    }

    @After
    public void runAfterEveryTest() {
        simpleMath = null;
    }

    /**
     * @BeforeClass and@AfterClass
     * Use @BeforeClass and @AfterClass annotations for
     * class wide "setup" and "tearDown"
     * respectively.Think them as one
     * time setup and tearDown.
     * They run for one time before and after all test cases.
     */
    @BeforeClass
    public static void runBeforeClass() {
// run for one time before all test cases
    }

    @AfterClass
    public static void runAfterClass() {
// run for one time after all test cases
    }

    /**
     * Exception Handling Use "expected" paramater with @Test annotation
     * for test cases that expect exception.Write the
     * class name of the exception that will be thrown.
     */

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
// divide by zero
        simpleMath.divide(1, 0);
    }

    /**
     * @Ignore Put @Ignore annotation for test cases you want to ignore.
     * You can add a string parameter that defines the reason of ignorance if you want.
     */

    @Ignore("Not Ready to Run")
    @Test
    public void multiplication() {
        assertEquals(15, simpleMath.multiply(3, 5));
    }

    /**
     * @Timeout Define a timeout period in miliseconds with "timeout"
     * parameter.The test fails when the timeout period exceeds.
     */

    @Test(timeout = 1000)
    public void infinity() {
        while (true)
            ;
    }

    /**
     * JUnit4Adapter Run your Junit 4 tests in Junit 3 test runners with Junit4Adapter.
     */
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(SimpleMathTest.class);
    }
}