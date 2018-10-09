package chapter6;

import java.util.Calendar;

public class chapter6_4_4 {
	public static void main(String[] args) {
        	Calendar c=Calendar.getInstance();
        	c.set(Calendar.MONTH,13);
        	System.out.println(c.getTime());
        	//启用non-leienet模式使设置的值不能超过范围
//        	c.setLenient(false);
//        	c.set(Calendar.MONTH,13);
//        	System.out.println(c.getTime());
	}
}
