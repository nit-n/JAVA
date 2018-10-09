package chapter5;
public class Chapter5_5_2 { //ͬ������	
	public static void main(String[] args) {
		   Ticket10 t=new Ticket10();
		   for(int i=0;i<5;i++) {
			   new Thread(t,"�߳�"+i).start();
		   }
	}

}
class Ticket10 implements Runnable{
	  private int tickets=10;
	  Object lock=new Object();
	  public void run() {
		     while(true) {
		    	   synchronized(lock){
		    		    try {
		    		    	Thread.sleep(10);
		    		    }catch(InterruptedException e) {
		    		    	e.printStackTrace();
		    		    }
		    	   }
		    	   if(tickets>0) {
		    		   System.out.println(Thread.currentThread().getName()
		    				   +"������Ʊ"+tickets--);
		    	   }else {
		    		   break;
		    	   }
		     }
	  }
}