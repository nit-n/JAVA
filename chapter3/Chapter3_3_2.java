package chapter3;
public class Chapter3_3_2 {
	public static void main(String[] args) {
		   Person5 p1= new Person5("С��");//������һ����������ʱageΪĬ��ֵ0
		   Person5 p2= new Person5("�",10);
		   p1.speak();
		   p2.speak();		   
	} 

}
class Person5{
	  String name;
	  int age;
	  public Person5 (String con_name,int  con_age) {//�����������ֵ������Ĳ���
		     name=con_name;
		     age=con_age;
	  }
	  public Person5 (String con_name){
		     name=con_name;
	  }
	  public void speak() {
		     System.out.println("��Һã��ҽ�"+name+"����"+age+"��");
	  }
}