package cn.czg.mapper;

import java.util.List;

import cn.czg.vo.Role;

public interface RoleMapper {

	public  Role findRoleByUserId(int id);//ͨ���û�id���ҽ�ɫ
	public List<Role> list();
}
