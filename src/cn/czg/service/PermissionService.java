package cn.czg.service;

import java.util.List;

import cn.czg.exception.UserException;
import cn.czg.vo.Permission;

public  interface PermissionService {
		//获取菜单
	public List<Permission> findMenuByUserId(int uid);
	//通过用户id获取 页面权限
		public  List<Permission> findPermissionByUserId(int uid);

	
}
