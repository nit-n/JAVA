package chapter5;
public class Chapter5_4_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Thread min=new Thread(new Minpriority(),"���ȼ��ϵ͵��߳�");
           Thread max=new Thread(new Maxpriority(),"���ȼ��ϸߵ��߳�");  
           min.setPriority(Thread.MIN_PRIORITY); //���߳�����Ϊ������ȼ�
           max.setPriority(10);                  //���߳����ȼ�����Ϊ10
           min.start();
           max.start();
	}
}
class Maxpriority implements Runnable{
	  public void run() {
		     for(int i=0;i<10;i++) {
		    	System.out.println(Thread.currentThread().getName()+"�������:"+i); 
		     }
	  }
}
class Minpriority implements Runnable{
	  public void run() {  
		     for(int i=0;i<10;i++) {
		    	 System.out.println(Thread.currentThread().getName()+"�������:"+i);
		     }
	  }
}