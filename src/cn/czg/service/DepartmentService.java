package cn.czg.service;

import java.util.List;

import cn.czg.vo.Department;


public interface DepartmentService {
	public List<Department> list();//��ȡȨ���б�
	public Department findDepartmentFromUserId(int id);

}
