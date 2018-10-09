package chapter6;

import java.util.Calendar;

public class chapter6_4_3 {
	public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        c.set(2008,7,8);//重新设置Calendar对象的时间
        c.add(Calendar.DATE,100);//将Calendar对象的时间按对应单位加上对应数值
        System.out.println(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+c.get(Calendar.DATE)+"日");
	}
}
