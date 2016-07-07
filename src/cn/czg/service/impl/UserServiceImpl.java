package cn.czg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.czg.exception.UserException;
import cn.czg.mapper.UserMapper;
import cn.czg.service.UserService;
import cn.czg.vo.User;

@Service("userService")
public class UserServiceImpl  implements UserService{
	@Autowired
	private UserMapper userMapper;
		
	//登陆判断
	public User findUserByName(String name) throws UserException {
		System.out.println("输入的用户名为"+name);
		User temp=	userMapper.findUserByName(name);
		if(temp==null){
			throw new UserException("用户名或密码不正确，请重新输入");
		}
		return temp;
		
	}
	

}
