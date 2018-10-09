package chapter2;
import java.util.*;
public class Chapter2_3_9{
	public static void main(String[] args) {
		   Random r=new Random();
		   int a=r.nextInt(100);
		   if(a>90) {
			        System.out.println("优秀"); 
		   }else if(a>80) {
			        System.out.println("良好"); 
		   }else if(a>70) {
			        System.out.println("合格"); 
		   }else {
			      System.out.println("不合格"); 
		   }
	}
}
