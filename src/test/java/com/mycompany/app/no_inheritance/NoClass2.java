package com.mycompany.app.no_inheritance;

import org.testng.annotations.*;

public class NoClass2 {
    @BeforeClass
    public void beforeClass() {
        System.out.println(this.getClass().getName() + ": before class\n");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(this.getClass().getName() + ": after class\n\n");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println(this.getClass().getName() + ": before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(this.getClass().getName() + ": after method\n");
    }

    @Test
    public void test1() {
        System.out.println(this.getClass().getName() + ": test #1");
    }

    @Test
    public void test2() {
        System.out.println(this.getClass().getName() + ": test #2");
    }
}
