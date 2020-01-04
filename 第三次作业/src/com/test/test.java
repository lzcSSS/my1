package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;





public class test {
	@Test
	public void Test1() throws IOException {
		InputStream input = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(input);
		SqlSession sqlSession = sessionFactory.openSession();
		System.out.println(sqlSession.getConnection());
	}

}
