package cn.czg.service;

import cn.czg.exception.UserException;
import cn.czg.vo.User;

public interface UserService {
	public User findUserByName(String name) throws UserException;
	
}
