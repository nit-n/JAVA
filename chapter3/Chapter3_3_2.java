package chapter3;
public class Chapter3_3_2 {
	public static void main(String[] args) {
		   Person5 p1= new Person5("小明");//仅传入一个参数，此时age为默认值0
		   Person5 p2= new Person5("李华",10);
		   p1.speak();
		   p2.speak();		   
	} 

}
class Person5{
	  String name;
	  int age;
	  public Person5 (String con_name,int  con_age) {//将传入参数的值赋给类的参数
		     name=con_name;
		     age=con_age;
	  }
	  public Person5 (String con_name){
		     name=con_name;
	  }
	  public void speak() {
		     System.out.println("大家好，我叫"+name+"今年"+age+"岁");
	  }
}