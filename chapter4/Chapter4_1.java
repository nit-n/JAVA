package chapter4;
public class Chapter4_1 {
	   public static void main(String[] args) {
		      Dogs d=new Dogs();
		      Dogs d1=new Dogs("1");
	//	      d.name="��";//����ֱ�ӵ��ø����Ա
		      d.PrintName();//����ʹ��������
		      d.shout();//������ø��෽��
	   } 
}
class Animal{//��дһ������Ϊ����,������һ��������2�����췽��(�вκ��޲�)
	  String name="����";
	  void shout() {
		   System.out.println("���﷢���Ľ���");
	  }
	  public Animal() {
		     System.out.println("��ֻ��һֻ����");
	  }
	  public Animal(String name) {
		     System.out.println("����һֻ"+name);
	  }
}
class Dogs extends Animal{//�̳�Animal��
	  String name="��";
	  public void PrintName() {
		     System.out.println("name:"+super.name);//ͨ��super�ؼ��ַ��ʸ������
		     System.out.println("name:"+name);
	  }
	  void shout() {//�������¸��෽��
		  super.shout();//ͨ��super�ؼ��ַ��ʸ��෽��
		  System.out.println("��������");
	  }
	  public Dogs(){//����Ĺ��췽��,���Զ����ø����ж�Ӧ�Ĺ��췽��(���ݲ���)
	  }
      public Dogs(String name){
	         super("��ʿ��");//ʹ��super�ؼ��ֵ��ø���Ĺ��췽��;
      }
}