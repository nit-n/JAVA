package chapter4;
public class Chapter4_4_3 {
	public static void main(String[] args) {  
	       Animals a=new Animals();
	       System.out.println(a.hashCode());//返回对象的哈希值
	       System.out.println(a.getClass().getName());//返回对象所属类名
	       System.out.println("Animals重新的toSrting()方法:"+a.toString());
	}
}
class Animals{
	  void shuot() {
		   System.out.println("父类自身的方法");
	  }
	  public String toString() {
		     return "这是父类对象的toString()方法";
	  }
}
