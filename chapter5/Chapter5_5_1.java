package chapter5;
public class Chapter5_5_1 {
	public static void main(String[] args) {//���߳�ͬ��
		// TODO Auto-generated method stub
		   S s=new S();
           new Thread(s,"�߳�һ").start();
           new Thread(s,"�̶߳�").start();
           new Thread(s,"�߳���").start();
           new Thread(s,"�߳���").start();
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
		    	  System.out.println(Thread.currentThread().getName()+"---����ȥ��Ʊ"+tickets--);
		     }
	  }
}