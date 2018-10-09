package chapter4;
interface PCI{
 	      void start();
	      void stop();
}
class NetWorkCard implements PCI{
	  public void start() {
		     System.out.println("");
	  }
	  public void stop() {
		     System.out.println("NetWork Stop");
	  }
}
class SoundCard implements PCI{
	  public void start() {
		     System.out.println("");
	  } 
	  public void stop() {
		     System.out.println("NetWork Stop");
	  }
}
class MainBoard{  //定义一个主板类，可以调用PCI接口的实现类
	  public void usePCICard(PCI p) {
		     p.start();
		     p.stop();
	  }
}
public class Chapter4_4_4_1 {
	public static void main(String[] args) {
		   MainBoard m=new MainBoard();
		   NetWorkCard n=new NetWorkCard();
		   m.usePCICard(n);
		   SoundCard s=new SoundCard();
		   m.usePCICard(s);
	}

}
