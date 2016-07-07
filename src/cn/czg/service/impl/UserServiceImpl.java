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
		
	//��½�ж�
	public User findUserByName(String name) throws UserException {
		System.out.println("������û���Ϊ"+name);
		User temp=	userMapper.findUserByName(name);
		if(temp==null){
			throw new UserException("�û��������벻��ȷ������������");
		}
		return temp;
		
	}
	

}
