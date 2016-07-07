package cn.czg.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import cn.czg.vo.Permission;


/**
 * ʵ�ֲ˵� ������
 * @author cc
 *
 */
public class MenuUtil {
	public static List<Permission> list2Menu(List<Permission> list){
		Map<Integer,Permission> map = new HashMap<Integer,Permission>();
		//��һ���˵�����map��
		for(Permission p:list){
			System.out.println(p.toString());
			if(p.getPid()==0){
				map.put(p.getId(), p);
				System.out.println("put 1 menu");
			}
		}
		//�������˵������Ӧ��һ���˵���
		for(Permission p:list){
			System.out.println(p.getName());
			if(p.getPid()!=0){
				//ȡһ���˵�
				Permission pm = map.get(p.getPid());
				pm.getChildren().add(p);
			}
		}
		List<Permission> menu=new ArrayList<Permission>();
		for(Iterator<Integer> iter = map.keySet().iterator();iter.hasNext();){
			menu.add(map.get(iter.next()));
		}
		//����
		Collections.sort(menu);
		System.out.println("����");
		for(int i=0;i<menu.size();i++){
			Collections.sort(menu.get(i).getChildren());
		}
		return menu;
	}
}
