package chapter3;
public class Chapter3_6_4 {
	   public static void main(String[] args) {
		      Single s=Single.getInstance();
		      Single s1=Single.getInstance();
		      System.out.println(s==s1);//判断2个对象是否相等(即是否为一个对象)		      
		      Single1.INSTANCE1.s1();
	}
}
class Single{//单例模式
	  private static Single INSTANCE=new Single();//自己建立一个对象并私有化
	  private Single() {}//私有化构造方法使得无法在类外部使用new关键字创建对象
	  public static Single getInstance(){//创建一个方法用于获取类的对象
		     return INSTANCE;
	  }
}
class Single1{
	  private Single1() {}
	  public static final Single1 INSTANCE1=new Single1();
	  void s1() {
		  System.out.println("通过直接访问类调用了内部方法");     
	  }
}