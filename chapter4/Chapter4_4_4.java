package chapter4;
public class Chapter4_4_4 {
	public static void main(String[] args) {
		   animalShout(new Animalss() {
	    	          public void shout() {
	    	        	     System.out.println("ͨ�������ڲ���ʵ���˽ӿڵĳ��󷽷�");
	    	          }
	       });		
			
	}
	public static void animalShout(Animalss a) {
		   a.shout();
	}
}
interface Animalss{
	     void shout();
}
