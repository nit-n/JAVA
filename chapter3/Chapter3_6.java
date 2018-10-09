package chapter3;
public class Chapter3_6 {
	   static int age;
	   static {//创建一个静态代码块
		      age=0;//初始化静态变量
		      System.out.println("静态代码块默认调用");
	   }   
	   public static void main(String[] args) {
		      Student1 stu1=new Student1();
		      Student1 stu2=new Student1();
              Student1.schoolName="学校名";
              System.out.println("对象1:"+stu1.schoolName);
              System.out.println("对象2:"+stu2.schoolName);
              stu1.sayHello();
              stu2.sayHello();
              System.out.println("打印静态变量:"+age);
	   }
}
class Student1{
	  static String schoolName;//静态成员
	  public static void sayHello() {//静态方法
		     System.out.println("HELLO");
	  }
	  static {
		     System.out.println("静态代码块被调用");
	  }
}
//static关键字只能用来修饰成员变量不能用来修饰局部变量
//由于静态方法在被调用时可以不创建任何对象，所以在一个静态方法中只能访问static修饰的成员(保证方法及成员为静态)
//静态代码块随着类加载而运行，通常用静态代码块初始化变量