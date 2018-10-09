package chapter5;
public class Chapter5_4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Thread min=new Thread(new Minpriority(),"优先级较低的线程");
           Thread max=new Thread(new Maxpriority(),"优先级较高的线程");  
           min.setPriority(Thread.MIN_PRIORITY); //把线程设置为最低优先级
           max.setPriority(10);                  //把线程优先级设置为10
           min.start();
           max.start();
	}
}
class Maxpriority implements Runnable{
	  public void run() {
		     for(int i=0;i<10;i++) {
		    	System.out.println(Thread.currentThread().getName()+"正在输出:"+i); 
		     }
	  }
}
class Minpriority implements Runnable{
	  public void run() {  
		     for(int i=0;i<10;i++) {
		    	 System.out.println(Thread.currentThread().getName()+"正在输出:"+i);
		     }
	  }
}