package chapter4;
public class Chapter4_4_4 {
	public static void main(String[] args) {
		   animalShout(new Animalss() {
	    	          public void shout() {
	    	        	     System.out.println("通过匿名内部类实现了接口的抽象方法");
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
