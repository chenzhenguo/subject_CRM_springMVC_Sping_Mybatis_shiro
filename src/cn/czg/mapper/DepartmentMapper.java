package cn.czg.mapper;

import java.util.List;

import cn.czg.vo.Department;
import cn.czg.vo.Role;

public interface DepartmentMapper {

	public  Department findDepartmentByUserId(int id);//ͨ��id���ҽ�ɫ
	public List<Department> list();
}
