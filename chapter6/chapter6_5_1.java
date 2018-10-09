package chapter6;

import java.text.*;
import java.util.*;

public class chapter6_5_1 {
	public static void main(String[] args) {
        Date date=new Date();
        DateFormat f=DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat l=DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat m=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
        DateFormat s=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        System.out.println("当前日期的完整格式为:"+f.format(date));
        System.out.println("当前日期的长格式为:"+l.format(date));
        System.out.println("当前日期的普通格式为:"+m.format(date));
        System.out.println("当前日期的短格式为:"+s.format(date));
	}
}
