package chapter6;

public class chapter6_1_3 {
	public static void main(String[] args) {
		System.out.println("添加字符串操作:");
		add();
		System.out.println("--------------");
		System.out.println("删除字符串操作:");
		remove();
		System.out.println("--------------");
		System.out.println("修改字符串操作:");
		alter();
	}
	public static void add(){
		StringBuffer s=new StringBuffer();
		s.append("123444");//始终将字符串内容添加到末尾
		System.out.println("添加字符串:"+s);
		s.insert(1,"aa");
		System.out.println("在指定位置添加字符串:"+s);
	}
	public static void remove(){
		StringBuffer s=new StringBuffer("abcdefg");
		s.delete(1,5);
		System.out.println("删除范围内的字符串:"+s);
		s.deleteCharAt(0);
		System.out.println("删除指定位置的字符串:"+s);
		s.delete(0,s.length());
		System.out.println("删除缓冲区内容:"+s);
	}
	public static void alter(){
		StringBuffer s=new StringBuffer("abcdefg");
		s.setCharAt(0,'a');
		System.out.println("修改指定位置的字符:"+s);
		s.replace(1,3,"qqqqq");
		System.out.println("替换指定位置的字符:"+s);//以指定范围内容替换提供的字符串,与范围大小无关
		System.out.println("翻转字符串:"+s.reverse());
	}
}
