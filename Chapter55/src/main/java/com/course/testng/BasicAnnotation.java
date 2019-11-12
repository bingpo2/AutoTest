package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是第一个测试标签");
    }
    @Test
    public void testCase2(){
        System.out.println("这是第二个测试标签");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforetest，在方法之前运行");
    }
    @AfterMethod
    public void afterMethoe(){
        System.out.println("afterTest,在方法之后运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass  这是一个类之前运行的");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass 这是类之后运行的注解");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("这个前套件");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("这个后套件");
    }
}
