package chapter3;
public class Chapter3_3 {
	public static void main(String[] args) {
		   System.out.println("��һ������:");
		   Person4 p1=new Person4();
		   System.out.println("�ڶ�������:");
		   Person4 p2=new Person4(20);
		   p2.speak();
	}

}
class Person4{
	  int age;
	  public Person4() {
		  System.out.println("�޲εĹ��췽����Ĭ�ϵ�����");
	  }
	  public Person4(int a) {
		     age=a;
	  }
	  public void speak() {
		  System.out.println("�вεĹ��췽����Ĭ�ϵ�����");
		  System.out.println("age="+age);
	  }
}