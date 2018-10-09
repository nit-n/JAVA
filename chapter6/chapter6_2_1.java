package chapter6;

import java.util.*;

public class chapter6_2_1 {
	public static void main(String[] args) {
		System.out.println("获取Java系统属性");
		Properties Properties=System.getProperties();
		Enumeration propertyNames=Properties.propertyNames();
		while(propertyNames.hasMoreElements()) {
			String key=(String)propertyNames.nextElement();
			System.out.println(key+"------------>"+System.getProperty(key));
		}
	}
}
