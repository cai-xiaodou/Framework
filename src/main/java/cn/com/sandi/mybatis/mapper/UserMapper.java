package cn.com.sandi.mybatis.mapper;

import java.util.List;

import cn.com.sandi.mybatis.model.User;

public interface UserMapper {

	public List<Object> getUserList();
	
	public boolean insertUser(User user);
	
	public User selectByid(Long id);
	
	//public int batchInsert(List<User> list);
}
