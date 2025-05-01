package TestNG;

import org.testng.annotations.*;

public class MyTest {

    @BeforeSuite
    public void beforeSuite() {
        // Code to execute before all tests in the suite
    	System.out.println("Before Suite Method");
    }

    @BeforeTest
    public void beforeTest() {
        // Code to execute before tests within a specific test
    	System.out.println("Before Test Method");
    }

    @BeforeClass
    public void beforeClass() {
        // Code to execute before the first test method in the class
    	System.out.println("Before Class Method");
    }

    @BeforeMethod
    public void beforeMethod() {
        // Code to execute before each test method
    	System.out.println("Before Method Method");
    }

    @Test
    public void test1() {
        // Test method 1
    	System.out.println(" Test1 Method");
    }

    @Test
    public void test2() {
        // Test method 2
    	System.out.println("Test2 Method");
    }

    @AfterMethod
    public void afterMethod() {
        // Code to execute after each test method
    	System.out.println("After Method Method");
    }

    @AfterClass
    public void afterClass() {
        // Code to execute after all test methods in the class

    	System.out.println("After Class Method");
    }

    @AfterTest
    public void afterTest() {
        // Code to execute after tests within a specific test

    	System.out.println("After Test Method");
    }

    @AfterSuite
    public void afterSuite() {
        // Code to execute after all tests in the suite

    	System.out.println("After Suite Method");
    }
}