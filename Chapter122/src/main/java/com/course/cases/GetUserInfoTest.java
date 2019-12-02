package com.course.cases;

import com.course.config.TestConfig;
import com.course.utils.DatabaseConfig;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetUserInfoCase {
    @Test(dependsOnGroups = "loginTrue",description = "获取用户信息的接口")
    public void getUserInfo() throws IOException {
        SqlSession sqlSession = DatabaseConfig.getSqlSession();
        GetUserInfoCase getUserInfoCase = sqlSession.selectOne("getUserInfoCase",1);
        System.out.println(getUserInfoCase.toString());
        System.out.println(TestConfig.getUserInfoUrl);
    }
}
