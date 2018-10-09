package chapter5;

public class Chapter5_5_7 {
	public static void main(String[] args) {
		r0 r=new r0();
		r.run();
        for(int i=0;i<100;i++) {
        	System.out.println("mian");
        }
	}

}
class r0 implements Runnable{
	public void run() {
        for(int i=0;i<50;i++) {
        	System.out.println("new");
        }
	}
}