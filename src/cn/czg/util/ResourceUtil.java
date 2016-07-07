package cn.czg.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * ����commonUrl��ҳ��
 * @author cc
 *
 */
public class ResourceUtil {
	//����comminUrl
	
	public static Set<String> getCommonUrl(){
		Set<String> set=new HashSet<String>();
		Properties props = new Properties();
		
		//�����ļ�
		try {																			
			props.load(ResourceUtil.class.getClassLoader().getResourceAsStream("commonUrl.properties"));
			Enumeration  em=	props.propertyNames();
			while(em.hasMoreElements()){
				set.add((String) em.nextElement());//����ȡ�����ļ����ص�������
			}
			
			return set;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
