package com.junit.class01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JunitDemoTest {

    @Before
    public void setUp(){
        System.out.println("Before test");
    }

    @After
    public void cleanUp(){
        System.out.println("After test");
    }

    @Test
    public void testCase1(){
        System.out.println("Hello World");
    }

    @Test
    public void testCase2(){
        System.out.println("Hello World2");
    }

    @Test
    public void testCase3(){
        System.out.println("Hello World3");
    }


}
