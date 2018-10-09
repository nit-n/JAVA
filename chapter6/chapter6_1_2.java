package chapter6;
public class chapter6_1_2 {
	public static void main(String[] args) {
        String s="玩游戏-敲代码-看电视-----";
        System.out.println("从第4个字符截取到末尾的结果:"+s.substring(3));
        System.out.println("从第5个字符截取到第6个字符的结果:"+s.substring(4,6));	
        System.out.println("字符串分割操作");d(s);
    }
    public static void d(String a) {
    	String[]s=a.split("-");
    	for(int i=0;i<s.length;i++) {
        System.out.print(s[i]+",");
    	}
    }
}
