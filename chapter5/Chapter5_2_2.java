package chapter5;
public class Chapter5_2_2 {
	public static void main(String[] args) {
		   MyThread1 m=new MyThread1();
		   Thread t=new Thread(m);
		   t.start();
		   int j=100;
		   while(j>=0) {
		    	System.out.println("main()线程"); 
			    j--;			    
		   }
	}
}
class MyThread1 implements Runnable{
	  public void run() {  
		     int i=100;
		     while(i>=0) {
		    	  System.out.println("run()线程"); 
		    	  i--;
		     }
	  }
}
