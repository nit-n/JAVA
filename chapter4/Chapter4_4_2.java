package chapter4;
public class Chapter4_4_2 {
	public static void main(String[] args) {
           Cat01 c=new Cat01();
           animalShout(c);//���þ�̬����,�������������
           Dog01 d=new Dog01();
           animalShout(d);

	}
	public static void animalShout(Animal01 animal) {
		   if(animal instanceof Cat01) {
             Cat01 c=(Cat01) animal; //ǿ�ƽ������������ת��Ϊ����
		     c.shout();//���������2������
		     c.sleep();
		   }else {
			    System.out.println("�ö������Ͳ�ƥ��");
		   }
 	}

}
interface Animal01{
	      void shout();
}
class Cat01 implements Animal01{
	  public void shout() {
		      System.out.println("�������¸��෽��");
	  }
	  void sleep() {
		   System.out.println("�����Լ��ķ���");
	  }
}
class Dog01 implements Animal01{
	  public void shout() {
	      System.out.println("�������¸��෽��");
  }
}