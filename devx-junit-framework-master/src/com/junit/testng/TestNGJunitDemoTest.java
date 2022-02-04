package com.junit.testng;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGJunitDemoTest {

    // This method will be executed before each test cases
    // Before annotation we're using to execute method before each test methods


    // This is our test cases & we're using @Test annotation to treat any methods as a test case in JUnit
    @Test
    public void testCase1() {
        System.out.println("Hello World1");
    }

    // This is our test cases & we're using @Test annotation to treat any methods as a test case in JUnit
    @Test
    public void testCase2() {
        System.out.println("Hello World2");
    }

    // This is our test cases & we're using @Test annotation to treat any methods as a test case in JUnit
    @Test
    public void testCase3() {
        System.out.println("Hello World3");
    }

    // This method will be executed after each test cases
    // After annotation we're using to execute method after each test methods
    @AfterMethod
    public void cleanUp() {
        System.out.println("After Test");
    }

    @BeforeMethod
    public  void setUp() {
        System.out.println("Before Test");
    }

}
