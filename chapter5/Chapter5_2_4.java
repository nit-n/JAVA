package chapter5;
public class Chapter5_2_4 {
	public static void main(String[] args) {//ͨ��ʵ��Runnable�ӿڵ�run()�����������߳�
		   TicketWindow1 tw=new TicketWindow1();
	       new Thread(tw,"����1").start();//������Thread�Ĺ��췽��(Runnable target,String name)
	       new Thread(tw,"����2").start();
	       new Thread(tw,"����3").start();
	       new Thread(tw,"����4").start();
	}
}
class TicketWindow1 implements Runnable{
	  private int tickets=100;
	  public void run() {
             while(true) {		     
            	   if(tickets>=0) {
            		    Thread t=Thread.currentThread();
            		    String th_name=t.getName();
            		    System.out.println(th_name+"���ڷ��۵�"+tickets--+"��Ʊ");
            	   }
             }
	  }
}