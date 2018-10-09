package chapter4;

public class chapter47_1 {
	public static void main(String[] args) {
		Student stu=new Student("����",15);
		Undergraduate und=new Undergraduate("����",25,"˶ʿ");
		stu.show();
		und.show();
	}

}
class Student{
	String name;
	int age;
	public Student(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println(name+","+age);
	}
}
class Undergraduate extends Student{
	String degree;
	public Undergraduate(String name, int age,String degree) {
		super(name, age);
		this.degree=degree;
	}
	public void show() {
		System.out.println(name+","+age+","+degree);
	}
}