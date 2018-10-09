package chapter2;
public class Chapter2_5_5 {
	public static void main(String[] args) {
		   int i,j;
	itcast:for(i=1;i<9;i++) { //将循环命名为itcast
		       for(j=1;j<=i;j++) {
		           if(i>6){
		    	         break itcast;
		           }
		          System.out.print("*");
		      }
		       System.out.print("\n");
	      }		   
	}
}
