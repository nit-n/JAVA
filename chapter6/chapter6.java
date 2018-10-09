package chapter6;

import java.text.*;
import java.util.*;

public class chapter6 {
	public static void main(String[] args) {
        c6_1();
        c6_2();
        c6_3();
	}
    public static void c6_1() {//将一个字符串反向遍历后进行输出
    	String s="HelloWorld";
    	StringBuffer sb=new StringBuffer();
    	char c;
    	for(int i=(s.length()-1);i>=0;i--) {
    		c=s.charAt(i);
    	    if (Character.isLowerCase(c)){
    	    	sb.append(Character.toUpperCase(c));
    	    }else{
    	    	sb.append(Character.toLowerCase(c));
    	    }
    	    
    	}
    	System.out.println(sb.toString());
    }
    public static void c6_2() {//获取当前时间的对象并使用指定模板格式化后输出
    	Calendar c=Calendar.getInstance();
    	c.add(Calendar.DATE,100);
    	Date d=c.getTime();
    	DateFormat df=DateFormat.getDateInstance(DateFormat.FULL);
    	System.out.println(df.format(d));
    }
    public static void c6_3() {//求20-50之间的随机数
    	Random r=new Random();
    	for(int i=0;i<5;i++) {
    		System.out.println(20+r.nextInt(50-20+1));
    	}
    }
}
