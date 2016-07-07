package cn.czg.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

/**
 * 解析commonUrl的页面
 * @author cc
 *
 */
public class ResourceUtil {
	//解析comminUrl
	
	public static Set<String> getCommonUrl(){
		Set<String> set=new HashSet<String>();
		Properties props = new Properties();
		
		//加载文件
		try {																			
			props.load(ResourceUtil.class.getClassLoader().getResourceAsStream("commonUrl.properties"));
			Enumeration  em=	props.propertyNames();
			while(em.hasMoreElements()){
				set.add((String) em.nextElement());//将获取到的文件加载到容器中
			}
			
			return set;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
