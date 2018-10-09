package chapter3;
public class Chapter3_2_4 {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.setAge(-10);
		stu.setName("是");
		stu.introduce();
		stu.setAge(30);
		stu.introduce();

	}

}
class Student{
	  private String name;
	  private int age;
	  public String getName() {
		     return name;
	  }
	  public void setName(String stuName) {
		     name=stuName;
	  }
	  public int getAge() {
             return age;		  
	  }
	  public void setAge(int stuAge) {
		     if(stuAge<0) {
		    	System.out.println("");
		     }else {
		    	 age=stuAge;
		     }
	  }
	  public void introduce() {
		     System.out.println("姓名:"+name+"年龄:"+age+"");
	  }
}
