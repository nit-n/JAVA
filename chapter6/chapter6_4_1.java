package chapter6;

import java.util.Date;

public class chapter6_4_1 {
	public static void main(String[] args) {
        Date d=new Date();//返回当前时间
        Date d1=new Date(999999999999L);//返回从1970年1月1日起的9999999999999999L毫秒的时间
	    System.out.println(d);
	    System.out.println(d1);
	}
}
