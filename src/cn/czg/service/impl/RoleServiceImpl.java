package cn.czg.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.czg.mapper.RoleMapper;
import cn.czg.service.RoleService;
import cn.czg.vo.Role;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	private RoleMapper roleMapper;
	
	@Override
	public List<Role> list() {
		return roleMapper.list();
	}

	@Override
	public Role findRoleFromUserId(int id) {
		return roleMapper.findRoleByUserId(id);
	}

	
}
