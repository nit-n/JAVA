package chapter4;
public class Chapter4_1 {
	   public static void main(String[] args) {
		      Dogs d=new Dogs();
		      Dogs d1=new Dogs("1");
	//	      d.name="狗";//子类直接调用父类成员
		      d.PrintName();//子类使用自身方法
		      d.shout();//子类调用父类方法
	   } 
}
class Animal{//编写一个类作为父类,其中有一个方法和2个构造方法(有参和无参)
	  String name="动物";
	  void shout() {
		   System.out.println("动物发出的叫声");
	  }
	  public Animal() {
		     System.out.println("这只是一只动物");
	  }
	  public Animal(String name) {
		     System.out.println("这是一只"+name);
	  }
}
class Dogs extends Animal{//继承Animal类
	  String name="狗";
	  public void PrintName() {
		     System.out.println("name:"+super.name);//通过super关键字访问父类变量
		     System.out.println("name:"+name);
	  }
	  void shout() {//子类重新父类方法
		  super.shout();//通过super关键字访问父类方法
		  System.out.println("呜呜呜呜");
	  }
	  public Dogs(){//子类的构造方法,会自动调用父类中对应的构造方法(根据参数)
	  }
      public Dogs(String name){
	         super("哈士奇");//使用super关键字调用父类的构造方法;
      }
}