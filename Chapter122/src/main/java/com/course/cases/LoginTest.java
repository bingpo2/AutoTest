package com.course.cases;


import com.course.config.TestConfig;
import com.course.module.InterfaceName;
import com.course.module.LoginCase;
import com.course.utils.ConfigFile;
import com.course.utils.DatabaseConfig;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;

public class LoginTest {

    @BeforeTest(groups = "loginTrue",description = "准备前工作")
    public static void beforeTest(){
        TestConfig.defaultHttpClient=new DefaultHttpClient();
        TestConfig.loginUrl= ConfigFile.getUrl(InterfaceName.LOGIN);
        TestConfig.addUserUrl=ConfigFile.getUrl(InterfaceName.ADDUSERINFO);
        TestConfig.updateUserInfoUrl=ConfigFile.getUrl(InterfaceName.UPDATEUSERINFO);
        TestConfig.getUserInfoUrl=ConfigFile.getUrl(InterfaceName.GETUSERINFO);
        TestConfig.getUserListUrl=ConfigFile.getUrl(InterfaceName.GETUSERLIST);
    }

    @Test(groups = "loginTrue",description = "用户成功登陆接口")
    public void loginTrue() throws IOException {
        SqlSession session = DatabaseConfig.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",1);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }

    @Test(groups = "loginFalse",description = "用户登陆接口失败")
    public void loginFalse() throws IOException {
        SqlSession session = DatabaseConfig.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",2);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);
    }
}