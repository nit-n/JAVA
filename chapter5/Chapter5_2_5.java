package chapter5;
public class Chapter5_2_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("mian线程是否是后台线程"+Thread.currentThread().isDaemon());
	       DamonThread d=new DamonThread();
	       Thread t=new Thread(d,"后台线程");
	       System.out.println("t线程默认是否是后台线程"+t.isDaemon());
	       t.setDaemon(true);//设置为后台线程
	       t.start();
	       for(int i=0;i<=10;i++) {
	    	   System.out.println(i);
	       }
	}
}
class DamonThread implements Runnable{
	 public void run() {
		    while(true) { 
		    	 System.out.println(Thread.currentThread().getName()+"--正在运行");
		    }
	 }
}