package com.scott.dev.mybatispractise.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import com.scott.dev.mybatispractise.entity.Account;
import com.scott.dev.mybatispractise.mapper.AccountMapper;

public class MyBatisTest {

    @Test
    public void testMyBatis() throws IOException {
        System.out.println("id = ");
        // 1. load mybatis config
        InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        // 2. get sqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // 3. get sqlSessionFactory
        SqlSessionFactory factory = sqlSessionFactoryBuilder.build(is);
        // 4. get sqlSession
        SqlSession sqlSession = factory.openSession();
        // 5. get mapper impl
        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);

        long id = mapper.insertAccount();

        // 要提交事務資料才回實際進入db
        sqlSession.commit();

        System.out.println("id = " + id);
    }
}
