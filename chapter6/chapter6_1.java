package chapter6;
public class chapter6_1 {
	public static void main(String[] args) {
		//String类的API实际运用
		String s=new String("a123a");
		String s1=new String(new char[]{'1','2','3'});
		String s2=" 4 5 6 7 9  8 ";
        System.out.println(s+s1);
        System.out.println(s.length()+"+"+s1.length());
        System.out.println("对应位子的字符:"+s.charAt(1));
        System.out.println("第一次出现该字符的下标:"+s.indexOf("a"));
        System.out.println("最后一次出现该字符的下标:"+s.lastIndexOf("a"));
        char [] a=s.toCharArray();
        System.out.print("调用方法循环打印出数组:");s(a);
        System.out.println("int值转换为String类型的值:"+s.valueOf(12));
        System.out.println("转换大写:"+s.toUpperCase());
        System.out.println(s2);
        System.out.println("除去2端空格:"+s2.trim());
        System.out.println("除去所有空格:"+s2.replace(" ",""));
        System.out.println("字符串判断方法的使用:");
        System.out.println("判断是否以空格开头:"+s2.startsWith(" "));
        System.out.println("判断是否以空格结尾:"+s2.endsWith(" "));
        System.out.println("判断是否包含空格:"+s2.contains(" "));
        System.out.println("判断是否为空:"+s2.isEmpty());
        System.out.println("判断是否相等:"+s1.equals(s2));
	}
    public static void s(char[]a) {
    	for(int i=0;i<a.length;i++) {
    		System.out.print(a[i]);
    	}
    	System.out.println();
    }
}
