package com.mycompany.app.with_inheritance;

import org.testng.annotations.BeforeClass;

public class SuperClass1 {
    @BeforeClass
    public void before() {
        System.out.println(this.getClass().getName() + ": before super class\n");
    }
}
