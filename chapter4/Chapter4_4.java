package chapter4;
public class Chapter4_4 {
	public static void main(String[] args) {
	       Animal10 a=new Cat();    //ʹ�ø��������ò����������������֤��̬
	       Animal10 a1=new Dog10(); //ʹ�ø��������ò����������������֤��̬
	       a.shout();
	       a1.shout();
	}
}
interface Animal10{
	      void shout();
}
class Cat implements Animal10{
	  public void shout() {
		     System.out.println("��һ�������¸��෽����ʵ�ַ���");
	  }
}
class Dog10 implements Animal10{
	  public void shout() {
		     System.out.println("��2�������¸��෽����ʵ�ַ���");
	  }
}