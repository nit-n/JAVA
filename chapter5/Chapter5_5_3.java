package chapter5;
public class Chapter5_5_3 {
	public static void main(String[] args) {
           Ticket1 t=new Ticket1();
           for(int i=0;i<5;i++) {
        	   new Thread(t,"线程"+i).start();
           }
	}
}
 class Ticket1 implements Runnable{
       private int tickets=10;
       public void run() {
		      while(true) {
		    	   saleTicket();
		    	   
		      }
	   }
       private synchronized void saleTicket() {//定义一个同步方法(相当于同步锁)
    	       if(tickets>0) {
    	    	   try {
    	    		   Thread.sleep(10);
    	    	   }catch(InterruptedException e) {
    	    		   e.printStackTrace();
    	    	   }
    	    	   System.out.println(Thread.currentThread().getName()
    	    			   +"卖出去的票"+tickets--);
    	       }
       }
 }