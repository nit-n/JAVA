package chapter5;
public class Chapter5_5_4 {
	public static void main(String[] args) {
		DeadLockThread d1=new DeadLockThread(true);
		DeadLockThread d2=new DeadLockThread(false);
		new Thread(d1,"Chinaese").start();
		new Thread(d2,"American").start();
	}
}
class DeadLockThread implements Runnable{
	  static Object chopsticks=new Object();
	  static Object knifeAndFork=new Object();
	  private boolean flag;
	  DeadLockThread(boolean flag){
		     this.flag=flag;
	  }
	  public void run() {
		     if(flag)  {
		    	      while(true) {
		    		  synchronized(chopsticks) {//ͬ���������ڲ�����һ��ͬ����������Ϊ����һ����̬����
		    			     System.out.println(Thread.currentThread().getName()
		    			    		 +"----------if c");
		    		         synchronized(knifeAndFork) {
		    			             System.out.println(Thread.currentThread().getName()
		    			    		 +"----------if k");
		    		         }
		    		   }
		    	 }
		     }else {
		    	  while(true) {
		    		   synchronized(knifeAndFork) {//ͬ���������ڲ�����һ��ͬ����������Ϊ����һ����̬����
		    			      System.out.println(Thread.currentThread().getName()
		    			    		  +"---else--k");
				    		   synchronized(chopsticks) {
				    			      System.out.println(Thread.currentThread().getName()
				    			    		  +"---else--c");
				    		   }
		    		   }
		    	  }
		     }
	  }
}
//�����������⣬2���߳��������������ǶԷ�����