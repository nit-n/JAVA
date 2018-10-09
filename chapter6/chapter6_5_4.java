package chapter6;

import java.text.SimpleDateFormat;

public class chapter6_5_4 {
	public static void main(String[] args) throws Exception{
		//可根据具体模板来传入字符串，并且将字符串解析
		SimpleDateFormat s=new SimpleDateFormat("yyyy/MMM/dd");
		String d="2018/8月/03";
	    System.out.println(s.parse(d));
	}
}
