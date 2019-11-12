package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void befotSuite(){
        System.out.println("开始运行了");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("开始运行拉");
    }
}
