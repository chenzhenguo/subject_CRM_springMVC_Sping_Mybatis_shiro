package cn.czg.mapper;

import cn.czg.vo.User;

public interface UserMapper {
	public User findUserByName(String name);//通过用户名查找用户

}
