package com.course.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;
import java.io.IOException;
import java.io.Reader;

public class DatabaseConfig {
    public static SqlSession getSqlSession() throws IOException {
        Reader reader = Resources.getResourceAsReader("databaseConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = factory.openSession();
        return sqlSession;
    }
}