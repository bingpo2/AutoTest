package com.test.casess;

import com.test.config.TestConfig;
import com.test.models.AddUserCase;
import com.test.utils.DatabaseUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.io.IOException;

public class AddUser {
    @Test(dependsOnGroups = "loginTrue",description = "添加用户接口")
    public void addUser() throws IOException {
       SqlSession sqlSession = DatabaseUtil.getSqlSession();
       AddUserCase addUserCase = sqlSession.selectOne("addUserCase",1);
        System.out.println(addUserCase.toString());
        System.out.println(TestConfig.addUserUrl);

    }
}
