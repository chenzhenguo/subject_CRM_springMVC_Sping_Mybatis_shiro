package cn.czg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.czg.mapper.RoleMapper;
import cn.czg.vo.Role;


public interface RoleService {
	public List<Role> list();//��ȡȨ���б�
	public Role findRoleFromUserId(int id);

}
