package chapter6;

import java.text.DateFormat;

public class chapter6_5_2 {
	public static void main(String[] args) throws Exception{
		DateFormat d=DateFormat.getDateInstance(DateFormat.LONG);
		String s="2018年7月13日";
		System.out.println(d.parse(s));
	}
}
