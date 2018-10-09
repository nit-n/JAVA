package chapter6;

public class chapter6_3_5 {
	public static void main(String[] args) {
        Integer i=new Integer(2);
        System.out.println("以二进制无符号整数型是返回一个整数参数的字符串:"+i.toBinaryString(4));
        System.out.println("以十六进制无符号整数型是返回一个整数参数的字符串:"+i.toHexString(45));
        System.out.println("以八进制无符号整数型是返回一个整数参数的字符串:"+i.toOctalString(45));
        System.out.println("返回一个Integer实例:"+i.valueOf(30));
	    System.out.println("将Integer类型以int形式返回:"+i.intValue());
	    String [] s= {"10","5"};
	    c(s);
	}
	public static void c(String [] args) {
		int w=Integer.parseInt(args[0]);
		int h=Integer.parseInt(args[1]);
		for(int i=0;i<h;i++) {
			StringBuffer s=new StringBuffer();
			for(int j=0;j<w;j++) {
				s.append("*");
			}
			System.out.println(s);
		}
	}
}
