package chapter3;
public class Chapter3_7 {
	public static void main(String[] args) {
		   Outer o=new Outer();
		   o.test();
		   Outer.Inner1 in=new Outer.Inner1();//ֱ��ʹ���ⲿ���������ڲ������;
		   in.show();
		   Outer.Inner o1=new Outer().new Inner();//ͨ���ⲿ���������ⲿ������ٴ����ڲ������;
		   o1.show();
	}
}
class Outer{
	  private int num=4;
	  private static int num1=4;
	  public void test() {//��Ա����,�������ڲ���Ķ��󲢵��÷���
		     Inner i=new Inner();
		     i.show();
	  }
	  class Inner{  //��Ա�ڲ���
		    void show() {
		    	 System.out.println("�ڲ�����ʳ�Ա����");
		    	 System.out.println("num:"+num);
		    }
	  }
	  static class Inner1{
		    void show() {
		    	 System.out.println("��̬�ڲ�����ʳ�Ա����");
		    	 System.out.println("num1:"+num1);
		    }
	  }
}
//��̬�ڲ���ֻ�ܷ����ⲿ�ľ�̬��Ա
//��̬�ڲ����п��Զ��徲̬��Ա���Ǿ�̬���ڲ����н�ֹ���徲̬�ĳ�Ա