package chapter5;
public class Chapter5_2_4 {
	public static void main(String[] args) {//通过实现Runnable接口的run()方法创建多线程
		   TicketWindow1 tw=new TicketWindow1();
	       new Thread(tw,"窗口1").start();//调用了Thread的构造方法(Runnable target,String name)
	       new Thread(tw,"窗口2").start();
	       new Thread(tw,"窗口3").start();
	       new Thread(tw,"窗口4").start();
	}
}
class TicketWindow1 implements Runnable{
	  private int tickets=100;
	  public void run() {
             while(true) {		     
            	   if(tickets>=0) {
            		    Thread t=Thread.currentThread();
            		    String th_name=t.getName();
            		    System.out.println(th_name+"正在发售第"+tickets--+"张票");
            	   }
             }
	  }
}