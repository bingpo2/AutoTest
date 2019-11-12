package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
    @Test(groups = "server")
    public void serverGroupOnTest1(){
        System.out.println("这是服务端测试1111111111");
    }
    @Test(groups = "server")
    public void serverGroupOnTest2(){
        System.out.println("这是服务端测试2222222222");
    }
    @Test(groups = "client")
    public void clientGroupOnTest1(){
        System.out.println("这是客户端测试333333333");
    }
    @Test(groups = "client")
    public void clientGroupOnTest2(){
        System.out.println("这是客户端测试4444444444");
    }
    @BeforeGroups("server")
    public void runServerStart(){
        System.out.println("server端开始运行");
    }
    @AfterGroups("server")
    public void runServerEnd(){
        System.out.println("sever端运行结束");
    }
}
