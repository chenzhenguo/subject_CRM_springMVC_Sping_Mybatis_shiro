package cn.czg.mapper;

import java.util.List;

import cn.czg.vo.Permission;

public interface PermissionMapper {
	
	public List<Permission> findMenuByUserId(int uid);
	public List<Permission> findPermissionByUserId(int uid);
	
}		
