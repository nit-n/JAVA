package chapter4;
public class Chapter4_4 {
	public static void main(String[] args) {
	       Animal10 a=new Cat();    //使用父类来引用并创建子类对象已验证多态
	       Animal10 a1=new Dog10(); //使用父类来引用并创建子类对象已验证多态
	       a.shout();
	       a1.shout();
	}
}
interface Animal10{
	      void shout();
}
class Cat implements Animal10{
	  public void shout() {
		     System.out.println("第一个类重新父类方法已实现方法");
	  }
}
class Dog10 implements Animal10{
	  public void shout() {
		     System.out.println("第2个类重新父类方法已实现方法");
	  }
}