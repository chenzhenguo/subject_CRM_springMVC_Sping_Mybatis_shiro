package cn.czg.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cn.czg.vo.Permission;


/**
 * 实现菜单 的排序
 * @author cc
 *
 */
public class MenuUtil {
	public static List<Permission> list2Menu(List<Permission> list){
		Map<Integer,Permission> map = new HashMap<Integer,Permission>();
		//将一级菜单放入map中
		for(Permission p:list){
			System.out.println(p.toString());
			if(p.getPid()==0){
				map.put(p.getId(), p);
				System.out.println("put 1 menu");
			}
		}
		//将二级菜单放入对应的一级菜单下
		for(Permission p:list){
			System.out.println(p.getName());
			if(p.getPid()!=0){
				//取一级菜单
				Permission pm = map.get(p.getPid());
				pm.getChildren().add(p);
			}
		}
		List<Permission> menu=new ArrayList<Permission>();
		for(Iterator<Integer> iter = map.keySet().iterator();iter.hasNext();){
			menu.add(map.get(iter.next()));
		}
		//排序
		Collections.sort(menu);
		System.out.println("排序");
		for(int i=0;i<menu.size();i++){
			Collections.sort(menu.get(i).getChildren());
		}
		return menu;
	}
}
