package chapter3;
public class Chapter3_6_4 {
	   public static void main(String[] args) {
		      Single s=Single.getInstance();
		      Single s1=Single.getInstance();
		      System.out.println(s==s1);//�ж�2�������Ƿ����(���Ƿ�Ϊһ������)		      
		      Single1.INSTANCE1.s1();
	}
}
class Single{//����ģʽ
	  private static Single INSTANCE=new Single();//�Լ�����һ������˽�л�
	  private Single() {}//˽�л����췽��ʹ���޷������ⲿʹ��new�ؼ��ִ�������
	  public static Single getInstance(){//����һ���������ڻ�ȡ��Ķ���
		     return INSTANCE;
	  }
}
class Single1{
	  private Single1() {}
	  public static final Single1 INSTANCE1=new Single1();
	  void s1() {
		  System.out.println("ͨ��ֱ�ӷ�����������ڲ�����");     
	  }
}