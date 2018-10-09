package chapter5;
public class Chapter5_5_1 {
	public static void main(String[] args) {//多线程同步
		// TODO Auto-generated method stub
		   S s=new S();
           new Thread(s,"线程一").start();
           new Thread(s,"线程二").start();
           new Thread(s,"线程三").start();
           new Thread(s,"线程四").start();
	}
}
class S implements Runnable{
	  private int tickets=10;
	  public void run() {
      Object lock=new Object();
		     while(true) {
		    	  try { 
		    		  Thread.sleep(10);
		    	  }catch(Exception e) {
		    		  e.printStackTrace();
		    	  }
		    	  System.out.println(Thread.currentThread().getName()+"---卖出去的票"+tickets--);
		     }
	  }
}