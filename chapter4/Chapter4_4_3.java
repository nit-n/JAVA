package chapter4;
public class Chapter4_4_3 {
	public static void main(String[] args) {  
	       Animals a=new Animals();
	       System.out.println(a.hashCode());//���ض���Ĺ�ϣֵ
	       System.out.println(a.getClass().getName());//���ض�����������
	       System.out.println("Animals���µ�toSrting()����:"+a.toString());
	}
}
class Animals{
	  void shuot() {
		   System.out.println("��������ķ���");
	  }
	  public String toString() {
		     return "���Ǹ�������toString()����";
	  }
}
