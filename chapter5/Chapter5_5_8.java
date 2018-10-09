package chapter5;

public class Chapter5_5_8 {
    public static int study=80;
	public static void main(String[] args) {
		r r=new r();
		r1 r1=new r1();
		r2 r2=new r2();
		r.run();
		r1.run();
		r2.run();
	}
	public static class r implements Runnable{
		public void run() {
			bb();
		}
	}
	public static class r1 implements Runnable{
		public void run() {
			bb();
		}
	}
	public static class r2 implements Runnable{
		public void run() {
			bb();
		}
	}
	public synchronized static void bb() {
		while(study>0) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			study=study-1;
			System.out.println(study);
		}
	}
}

	
