package cn.czg.mapper;

import java.util.List;

import cn.czg.vo.Role;

public interface RoleMapper {

	public  Role findRoleByUserId(int id);//通过用户id查找角色
	public List<Role> list();
}
