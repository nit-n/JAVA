package chapter5;
public class Chapter5_2_1 {
	public static void main(String[] args) {
		   MyThread m=new MyThread();
		   m.start();
           int j=10;
           while(j>=0) {
        	   System.out.println("main()线程");
        	   j--;
           }
	}
}

class MyThread extends Thread{
	  public void run() {
		     int i=10;
		     while(i>=0) {
		    	  System.out.println("run()线程");
		    	  i--;
		     }
	  }
}
