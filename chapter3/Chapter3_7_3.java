package chapter3;
public class Chapter3_7_3 {
	public static void main(String[] args) {
		   Outer1 o=new Outer1();
		   o.test();
	}
}
class Outer1{
	  private int num=4;
	  public void test() {
		     class Inner{//�����ڲ��ඨ����һ����ķ����У���ֻ���ڵ�ǰ����ʹ��
		    	   void show() {
		    		    System.out.println("�����ڲ��౻������");
		    		    System.out.println("num:"+num);
		    	   }
		     }
		     Inner i=new Inner();
		     i.show();
	  }
}