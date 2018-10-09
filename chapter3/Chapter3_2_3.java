package chapter3;
public class Chapter3_2_3 {
	public static void main(String[] args) {
		   Person3 p=new  Person3();
		   p.say();
		   try {
		   p=null;
		   p.say();
		   }catch(Exception e) {
			   System.out.println("");
		   }
	}

}
class Person3{
	  void say() {
		   System.out.println("p3默认方法被调用");
	  }
}