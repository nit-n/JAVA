package chapter3;
public class Chapter3_7_3 {
	public static void main(String[] args) {
		   Outer1 o=new Outer1();
		   o.test();
	}
}
class Outer1{
	  private int num=4;
	  public void test() {
		     class Inner{//方法内部类定义在一个类的方法中，且只能在当前方法使用
		    	   void show() {
		    		    System.out.println("方法内部类被调用了");
		    		    System.out.println("num:"+num);
		    	   }
		     }
		     Inner i=new Inner();
		     i.show();
	  }
}