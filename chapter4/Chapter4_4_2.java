package chapter4;
public class Chapter4_4_2 {
	public static void main(String[] args) {
           Cat01 c=new Cat01();
           animalShout(c);//调用静态方法,并传入子类对象
           Dog01 d=new Dog01();
           animalShout(d);

	}
	public static void animalShout(Animal01 animal) {
		   if(animal instanceof Cat01) {
             Cat01 c=(Cat01) animal; //强制将父类对象类型转换为子类
		     c.shout();//调用子类的2个方法
		     c.sleep();
		   }else {
			    System.out.println("该对象类型不匹配");
		   }
 	}

}
interface Animal01{
	      void shout();
}
class Cat01 implements Animal01{
	  public void shout() {
		      System.out.println("子类重新父类方法");
	  }
	  void sleep() {
		   System.out.println("子类自己的方法");
	  }
}
class Dog01 implements Animal01{
	  public void shout() {
	      System.out.println("子类重新父类方法");
  }
}