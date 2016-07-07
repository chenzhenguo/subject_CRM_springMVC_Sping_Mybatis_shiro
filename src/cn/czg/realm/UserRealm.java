package cn.czg.realm;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import cn.czg.exception.UserException;
import cn.czg.service.DepartmentService;
import cn.czg.service.PermissionService;
import cn.czg.service.RoleService;
import cn.czg.service.UserService;
import cn.czg.vo.Permission;
import cn.czg.vo.User;

public class UserRealm extends  AuthorizingRealm{
@Autowired
private UserService userService;//�Զ�����UserService
@Autowired
private PermissionService permissionService;//������Ȩ������

@Autowired
private RoleService roleService;
@Autowired
private DepartmentService departmentService;
		
	
	@Override
	public String getName() {
		
		return "userRealm";
	}
	
	//��֤
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username=(String) token.getPrincipal();//��ȡ�û���
		//�����û���ȡ������
		User currentUser =null;
		try {
			 currentUser =	userService.findUserByName(username);//ͨ���û�����ȡ�û�]
			 
			 System.out.println(currentUser.toString());
			
		} catch (UserException e) {
			e.printStackTrace();
		}
		currentUser.setDept(departmentService.findDepartmentFromUserId(currentUser.getId()));
		System.out.println(departmentService.findDepartmentFromUserId(currentUser.getId()).toString());
		currentUser.setRole(roleService.findRoleFromUserId(currentUser.getId()));
		//���˵����õ�user��
		//����� ����ȡ���˵���ʱ�� ��ѯ���Ǹ����pid Ӧ��ͨ�� �û�id ��ѯ�� Ȩ�޵�idzhaodao ��Ӧ��Ȩ��
		System.out.println(roleService.findRoleFromUserId(currentUser.getId()).toString());
		currentUser.setMenus(permissionService.findMenuByUserId(currentUser.getId()));
		System.out.println(permissionService.findMenuByUserId(currentUser.getId()).size());
		
		//��Ȩ���������õ�user��
		//currentUser.setPermissions(permissionService.findPermissionByUserId(currentUser.getId()));
		
		//���� �������û���Ϣ
		SimpleAuthenticationInfo info= new  SimpleAuthenticationInfo(currentUser, currentUser.getPassword(), ByteSource.Util.bytes(currentUser.getSalt()), getName());
		return  info;
	}
		//��Ȩ
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User currentUser=(User)	principals.getPrimaryPrincipal();//��ȡ��ǰ�û�
		
		//����Ȩ����Ϣ
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();//��Ȩ��Ϣ
		List<Permission> list= currentUser.getPermissions();//��ȡ��ǰ�û�����Ȩ��Ϣ
		
		for (Permission p : list) {
			info.addStringPermission(p.getPercode());
		}
		return info;
	}
	
}
