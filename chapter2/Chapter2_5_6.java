package chapter2;
public class Chapter2_5_6 {
	public static void main(String[] args) {  //定义一个方法用于实现100以内的奇数累加
		   int sum=0;
		   for(int i=0;i<=100;i++) {
			   if(i%2==0) {
				   continue; //当遇见偶数时，不累加
			   }
			   sum+=i;
		   }
		   System.out.println(sum);
		   s1();
	}
	public static void s1(){ //定义一个方法用于实现100以内的偶数累加
		   int sum1=0;
		   for(int j=0;j<=100;j++) {
			   if(j%2==1) {
				   continue;//当遇见奇数时，不累加
			   }
			   sum1+=j;
		   }
		   System.out.println(sum1);
	}

}
