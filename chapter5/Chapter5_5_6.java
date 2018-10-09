package chapter5;

public class Chapter5_5_6{
	public static void main(String[] args) {
		th t=new th();
		t.th();
		System.out.println("线程"+2);
	}
}
class th extends Thread{
	public static void th(){
		System.out.println("线程"+1);
	}
}