package chapter3;
public class Chapter3_4 {
	   public static void main(String[] args) {
		      System.out.println("调用参数为字符串的构造方法:");
		      Person6 p=new Person6("dd"); //传入参数调用有参的构造方法
		      System.out.println("调用参数为整数的构造方法:");
		      Person6 p2=new Person6(1);
	   }
}
class Person6{
	  public Person6(){
		     System.out.println("无参的构造方法被调用了");
	  }
	  public Person6(String name) {
		     this();//调用无参的构造方法
		     System.out.println("有参的构造方法被调用了");
	  }
	  public Person6(int age) {
		     this("");//调用有参构造方法
		     System.out.println("第2个有参的构造方法被调用了");
	  }
}
//this关键字调用构造方法必须位于第一行且只能用一次
//只能在构造方法中使用this关键字调用其他构造方法，不能在成员方法中使用this关键字
//不能在2个构造方法中使用this关键字相互调用(逻辑错误)