package cn.czg.service.impl;

import java.awt.Menu;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.czg.mapper.PermissionMapper;
import cn.czg.service.PermissionService;
import cn.czg.util.MenuUtil;
import cn.czg.vo.Permission;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService{
	@Autowired
	private PermissionMapper permissionMapper;
	
	/**
	 * ͨ���û�id��ȡ�˵�
	 */
	public List<Permission> findMenuByUserId(int uid) {
		System.out.println("user id >>"+uid);
		List<Permission>  list=permissionMapper.findMenuByUserId(uid);
		System.out.println("get permission size is >"+list.size());
		return MenuUtil.list2Menu(list);
	}

	/**
	 *  ͨ���û�id��ȡȨ��
	 */
	public List<Permission> findPermissionByUserId(int uid) {
		return  permissionMapper.findPermissionByUserId(uid);

	}  

	
	
}
