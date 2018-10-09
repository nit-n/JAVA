package chapter3;
public class Chapter3_3 {
	public static void main(String[] args) {
		   System.out.println("第一个对象:");
		   Person4 p1=new Person4();
		   System.out.println("第二个对象:");
		   Person4 p2=new Person4(20);
		   p2.speak();
	}

}
class Person4{
	  int age;
	  public Person4() {
		  System.out.println("无参的构造方法被默认调用了");
	  }
	  public Person4(int a) {
		     age=a;
	  }
	  public void speak() {
		  System.out.println("有参的构造方法被默认调用了");
		  System.out.println("age="+age);
	  }
}