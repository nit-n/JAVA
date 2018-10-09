package chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex2 {

	public static void main(String[] args) {
//		String img="<img hidefocus=\"true\" class=\"index-logo-src\" src=\"//www.baidu.com/img/bd_logo1.png\" width=\"270\" height=\"129\" usemap=\"#mp\">";
		String ima="<img [a-z]{0,100}[=]\\\"[a-z]{10} ";
		String a="<a  =11asd></a>";
		String b="^<img.*";
		String b1="\\b<a.*";
		System.out.println(a.matches(b1));
//		System.out.println(img.matches(b));
//		String s="aaaaab"+"aaaaab"+"edasdasd";
//		Pattern p = Pattern.compile("a*b");
//		 Matcher m = p.matcher(s);
//		 boolean bz = m.matches();
//			if (m.find())
//			{
//				// 打印出结果
//				System.out.println(m.group()); 
//			}
//		System.out.println("\"");
//		String num = "13880288641";
//		String reg = "1[34578][0-9]{9}";
//		System.out.println(num.matches(reg));
	}

}
