package chapter3;
public class Chapter3_4 {
	   public static void main(String[] args) {
		      System.out.println("���ò���Ϊ�ַ����Ĺ��췽��:");
		      Person6 p=new Person6("dd"); //������������вεĹ��췽��
		      System.out.println("���ò���Ϊ�����Ĺ��췽��:");
		      Person6 p2=new Person6(1);
	   }
}
class Person6{
	  public Person6(){
		     System.out.println("�޲εĹ��췽����������");
	  }
	  public Person6(String name) {
		     this();//�����޲εĹ��췽��
		     System.out.println("�вεĹ��췽����������");
	  }
	  public Person6(int age) {
		     this("");//�����вι��췽��
		     System.out.println("��2���вεĹ��췽����������");
	  }
}
//this�ؼ��ֵ��ù��췽������λ�ڵ�һ����ֻ����һ��
//ֻ���ڹ��췽����ʹ��this�ؼ��ֵ����������췽���������ڳ�Ա������ʹ��this�ؼ���
//������2�����췽����ʹ��this�ؼ����໥����(�߼�����)