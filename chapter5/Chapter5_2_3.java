package chapter5;
public class Chapter5_2_3 {    //ͨ��ʹ��Thread���run()������ʵ�ֶ��߳�
	   public static void main(String[] args) {
		      new TicketWindow().start();
		      new TicketWindow().start();
		      new TicketWindow().start();
		      new TicketWindow().start();
	   }
//���к�4���̻߳�ֱ�ʹ��tickets;(������ʵ��)
}
class TicketWindow extends Thread{
	  private int tickets=100;
	  public void run() {
	     i:  while(true) {
		    	  if(tickets>0) {
		    		 Thread th=Thread.currentThread();
		    		 String th_name=th.getName();
		    		 System.out.println(th_name+"���ڷ��۵�"+tickets--+"��Ʊ");
		    	  }else {
		    		    break i;
		    	  }
		     }
	  }
}