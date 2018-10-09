package chapter6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class chapter6_5_3 {//SimpleDateFormat类可以根据日期模板来打印出日期
	public static void main(String[] args) {
        SimpleDateFormat d=new SimpleDateFormat(
        		"Gyyyy年MM月dd日:今天是yyyy年的第D天,E");
        System.out.println(d.format(new Date()));
	}
}
