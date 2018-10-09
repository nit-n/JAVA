package chapter4;

public class Chapter4_3 {
	public static void main(String[] args) {
		   Dog d=new Dog(); 
		   d.shout();   
		   d.shout1(); 
		   Dog31 d1=new Dog31();
		   d1.breathe();   
		   d1.run();       
		   d1.liveOnLand();
	}
}
abstract class Animal12 {
	   abstract void shout();
	   void shout1() {
		    System.out.println("");
	   }
}
class Dog extends Animal12{
	  void shout() {   
		   System.out.println("");
	  }
}
interface Animal31{
          int id=1;
          void breathe();
          void run();
}
interface LandAnimal extends Animal31{
	      void liveOnLand();
}
class Dog31 implements Animal31{
      public void breathe() {
	         System.out.println(""+id);
      };
      public void run() {
	         System.out.println(""+id);
      };
      public void liveOnLand() {
    	     System.out.println(""+id);
      }
}
interface f{}
interface f1{}
class c{}
class f3 extends c implements f,f1{}
