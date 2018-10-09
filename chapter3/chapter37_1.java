package chapter3;
public class chapter37_1 {
	public static void main(String[] args) {
		Student12 s1=new Student12();
		Student12 s2=new Student12("�",90);
		s1.setName("С��");//�������÷���
		s1.setGrade(98);
		System.out.println(s1.name+"����"+s1.grade+"��");
		System.out.println(s2.name+"����"+s2.grade+"��");
		Father.Child c=new Father().new Child();//ͨ���ⲿ������������ڲ������
		c.introFather();
	}
}
class Student12{
	  String name;
	  int grade;
	  public void setName(String name) {//�÷����ɽ���һ��String���͵Ĳ���
		     this.name=name;//ͨ��this�ؼ��ַ��ʳ�Ա����������������ֵ����Ա����
	  }
	  public String getName() {//�÷������ȡһ��String���͵Ĳ���
		     return name;//���س�Ա����name���÷���
	  }
	  public void setGrade(int grade) {//�÷����ɽ���һ��int���͵Ĳ���
		     this.grade=grade;//ͨ��this�ؼ��ַ��ʳ�Ա����������������ֵ����Ա����
	  }
	  public int getGrade() {//�÷������ȡһ��int���͵Ĳ���
		     return grade;//���س�Ա����grade���÷���
	  }
	  public Student12(){//����һ���޲εĹ��췽��,�����ڴ�������		   
	  }
	  public Student12(String name,int grade){//����һ���вεĹ��췽��,���ڽ�������ֵ����Ա����
		   this.name=name;
		   this.grade=grade;
	  }	  
}
class Father{
	  private String name="zhangjun";//˽�л���Ա����
	  class Child{
		    void introFather() {//�÷�����ӡ���˳�Ա����(������)
		    	 System.out.println("�Ұְֽ�:"+name);
		    }
	  }
}
