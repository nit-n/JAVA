package chapter3;
public class Chapter3_7 {
	public static void main(String[] args) {
		   Outer o=new Outer();
		   o.test();
		   Outer.Inner1 in=new Outer.Inner1();//直接使用外部类名创建内部类对象;
		   in.show();
		   Outer.Inner o1=new Outer().new Inner();//通过外部类名创建外部类对象再创建内部类对象;
		   o1.show();
	}
}
class Outer{
	  private int num=4;
	  private static int num1=4;
	  public void test() {//成员方法,创建了内部类的对象并调用方法
		     Inner i=new Inner();
		     i.show();
	  }
	  class Inner{  //成员内部类
		    void show() {
		    	 System.out.println("内部类访问成员变量");
		    	 System.out.println("num:"+num);
		    }
	  }
	  static class Inner1{
		    void show() {
		    	 System.out.println("静态内部类访问成员变量");
		    	 System.out.println("num1:"+num1);
		    }
	  }
}
//静态内部类只能访问外部的静态成员
//静态内部类中可以定义静态成员，非静态的内部类中禁止定义静态的成员