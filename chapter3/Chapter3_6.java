package chapter3;
public class Chapter3_6 {
	   static int age;
	   static {//����һ����̬�����
		      age=0;//��ʼ����̬����
		      System.out.println("��̬�����Ĭ�ϵ���");
	   }   
	   public static void main(String[] args) {
		      Student1 stu1=new Student1();
		      Student1 stu2=new Student1();
              Student1.schoolName="ѧУ��";
              System.out.println("����1:"+stu1.schoolName);
              System.out.println("����2:"+stu2.schoolName);
              stu1.sayHello();
              stu2.sayHello();
              System.out.println("��ӡ��̬����:"+age);
	   }
}
class Student1{
	  static String schoolName;//��̬��Ա
	  public static void sayHello() {//��̬����
		     System.out.println("HELLO");
	  }
	  static {
		     System.out.println("��̬����鱻����");
	  }
}
//static�ؼ���ֻ���������γ�Ա���������������ξֲ�����
//���ھ�̬�����ڱ�����ʱ���Բ������κζ���������һ����̬������ֻ�ܷ���static���εĳ�Ա(��֤��������ԱΪ��̬)
//��̬�������������ض����У�ͨ���þ�̬������ʼ������