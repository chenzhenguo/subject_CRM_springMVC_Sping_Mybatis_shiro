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
private UserService userService;//自动加载UserService
@Autowired
private PermissionService permissionService;//加载授权方法类

@Autowired
private RoleService roleService;
@Autowired
private DepartmentService departmentService;
		
	
	@Override
	public String getName() {
		
		return "userRealm";
	}
	
	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		String username=(String) token.getPrincipal();//获取用户名
		//根据用户名取出密码
		User currentUser =null;
		try {
			 currentUser =	userService.findUserByName(username);//通过用户名获取用户]
			 
			 System.out.println(currentUser.toString());
			
		} catch (UserException e) {
			e.printStackTrace();
		}
		currentUser.setDept(departmentService.findDepartmentFromUserId(currentUser.getId()));
		System.out.println(departmentService.findDepartmentFromUserId(currentUser.getId()).toString());
		currentUser.setRole(roleService.findRoleFromUserId(currentUser.getId()));
		//将菜单设置到user中
		//出错点 ：在取出菜单的时候 查询的是父类的pid 应该通过 用户id 查询出 权限的idzhaodao 对应的权限
		System.out.println(roleService.findRoleFromUserId(currentUser.getId()).toString());
		currentUser.setMenus(permissionService.findMenuByUserId(currentUser.getId()));
		System.out.println(permissionService.findMenuByUserId(currentUser.getId()).size());
		
		//将权限内容设置到user中
		//currentUser.setPermissions(permissionService.findPermissionByUserId(currentUser.getId()));
		
		//加盐 并返回用户信息
		SimpleAuthenticationInfo info= new  SimpleAuthenticationInfo(currentUser, currentUser.getPassword(), ByteSource.Util.bytes(currentUser.getSalt()), getName());
		return  info;
	}
		//授权
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User currentUser=(User)	principals.getPrimaryPrincipal();//获取当前用户
		
		//设置权限信息
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();//授权信息
		List<Permission> list= currentUser.getPermissions();//获取当前用户的授权信息
		
		for (Permission p : list) {
			info.addStringPermission(p.getPercode());
		}
		return info;
	}
	
}
