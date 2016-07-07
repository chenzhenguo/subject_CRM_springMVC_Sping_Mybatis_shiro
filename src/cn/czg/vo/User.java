package cn.czg.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * 用户表
 * @author cc
 *
 */
public class User implements Serializable{
	private int id;
	private String userName;//登录名
	private String password;//登录密码
	private String sex;
	private String name;
	private String salt;
	private Date createTime;
	private Department dept;//部门
	private Role role; //角色
	private int deptId;
	private int roleId;
	//菜单权限
	private List<Permission> menus;
	//按钮权限
	private  List<Permission>  permissions;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("set id"+id);
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getRoleId() {
		
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public List<Permission> getMenus() {
		return menus;
	}
	public void setMenus(List<Permission> menus) {
		this.menus = menus;
	}
	public List<Permission> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + ", sex=" + sex + ", name=" + name + ", salt="
				+ salt + ", createTime=" + createTime + ", dept=" + dept
				+ ", role=" + role + ", deptId=" + deptId + ", roleId="
				+ roleId + ", menus=" + menus + ", permissions=" + permissions
				+ "]";
	}
		
	

	
	

	
	
	
}
