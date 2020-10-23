package cn.com.sandi.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.com.sandi.mybatis.mapper.UserMapper;
import cn.com.sandi.mybatis.model.User;

public class App {

	public static void main(String[] args) {
		
		String resource = "config/mybatis-config.xml";
		SqlSession session = null;
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sqlSessionFactory.openSession();
			UserMapper userMapper = session.getMapper(UserMapper.class);
			User user = userMapper.selectByid(1L);
			System.out.println(user.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (session != null) session.close();
		}
		
	}
	 
}
