package chapter5;
public class Chapter5_2_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           System.out.println("mian�߳��Ƿ��Ǻ�̨�߳�"+Thread.currentThread().isDaemon());
	       DamonThread d=new DamonThread();
	       Thread t=new Thread(d,"��̨�߳�");
	       System.out.println("t�߳�Ĭ���Ƿ��Ǻ�̨�߳�"+t.isDaemon());
	       t.setDaemon(true);//����Ϊ��̨�߳�
	       t.start();
	       for(int i=0;i<=10;i++) {
	    	   System.out.println(i);
	       }
	}
}
class DamonThread implements Runnable{
	 public void run() {
		    while(true) { 
		    	 System.out.println(Thread.currentThread().getName()+"--��������");
		    }
	 }
}