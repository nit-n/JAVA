package chapter5;
public class Chapter5_2_3 {    //通过使用Thread类的run()方法来实现多线程
	   public static void main(String[] args) {
		      new TicketWindow().start();
		      new TicketWindow().start();
		      new TicketWindow().start();
		      new TicketWindow().start();
	   }
//运行后4个线程会分别使用tickets;(不符合实际)
}
class TicketWindow extends Thread{
	  private int tickets=100;
	  public void run() {
	     i:  while(true) {
		    	  if(tickets>0) {
		    		 Thread th=Thread.currentThread();
		    		 String th_name=th.getName();
		    		 System.out.println(th_name+"正在发售第"+tickets--+"张票");
		    	  }else {
		    		    break i;
		    	  }
		     }
	  }
}