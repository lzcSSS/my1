package com.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.dao.UserMapper;
import com.entities.User;

public class testUser {
	@Test
	public void test1() throws IOException {
		InputStream resource = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resource);
		SqlSession sqlSession = sessionFactory.openSession();
		
		UserMapper mapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
		
//		User user = new User("小xiao");
//		user.setUid(10);
//		mapper.updateUser(user);
		//System.out.println(mapper.addUser(user));
		List<User> users = mapper.getUsers(null);
		System.out.println(users);
		//mapper.deleteUser(1);
		sqlSession.commit();
	
	}

}
