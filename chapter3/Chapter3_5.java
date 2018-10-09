package chapter3;
public class Chapter3_5 {
	public static void main(String[] args) {
		   Person7  p1=new Person7();
		   Person7 p2=new Person7();
		   p1=null;
		   p2=null;
		   System.gc();
	}
}
class Person7{
	  public Person7() {
		     System.out.println("无效的对象将被作为垃圾回收");
	  }
}