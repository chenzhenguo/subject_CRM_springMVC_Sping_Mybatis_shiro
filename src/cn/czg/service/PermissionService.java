package cn.czg.service;

import java.util.List;

import cn.czg.exception.UserException;
import cn.czg.vo.Permission;

public  interface PermissionService {
		//��ȡ�˵�
	public List<Permission> findMenuByUserId(int uid);
	//ͨ���û�id��ȡ ҳ��Ȩ��
		public  List<Permission> findPermissionByUserId(int uid);

	
}
