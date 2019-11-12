package com.course.testng;

import org.testng.annotations.Test;

public class DepandTest {
@Test
    public void test1(){
    System.out.println("这是test1");
       // throw  new RuntimeException();

    }
    @Test(dependsOnMethods={"test1"})
    public void test2(){
    System.out.println("这个test2");
    }
}
