package chapter6;

import java.util.Calendar;

public class chapter6_4_2 {
	public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        int y=c.get(Calendar.YEAR);
        int mon=c.get(Calendar.MONTH)+1;
        int d=c.get(Calendar.DATE);
        int h=c.get(Calendar.HOUR);
        int min=c.get(Calendar.MINUTE);
        int s=c.get(Calendar.SECOND);
        System.out.println("当前时间为:"+y+"年"+mon+"月"+d+"日"+h+"时"+min+"分"+s+"秒");
	}
}
