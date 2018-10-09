package chapter5;
public class Chapter5_4_4 {
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		   e e=new e();
           Thread t=new Thread(e,"线程一");
           t.start();
           for(int i=1;i<6;i++) {
        	   System.out.println(Thread.currentThread().getName()+"输入"+i);
               if(i==2) {
            	   t.join();
               }
               Thread.sleep(500);
           }
	}
}
class e implements Runnable{
	  public void run() {
		     for(int i=1;i<6;i++) {
		    	 System.out.println(Thread.currentThread().getName()+"输入"+i);
		     }
		     try {
		    	 Thread.sleep(500);
		     }catch(Exception e) {
		    	   e.printStackTrace();
		     }
	  }
}