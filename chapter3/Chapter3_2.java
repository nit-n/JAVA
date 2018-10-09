package chapter3;
public class Chapter3_2 {
	public static void main(String[] args) {
		 Person p1=new  Person();
		 Person p2=new  Person();
		 p1.age=200;
		 p1.speak();
		 p2.speak();
	}
}
class Person {
	int age=20;
	void speak() {
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
