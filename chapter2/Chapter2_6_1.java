package chapter2;
public class Chapter2_6_1 {//方法的基本调用
	public static void main(String[] args) {
		   int are=getArea(3,4);
		   int sum1=getSum(4,9);
		   int left=getLeft(5);
		   System.out.println(are);
		   System.out.println(sum1);
		   System.out.println(left);
	}
	public static int getArea(int x,int y) {
		   int temp=x*y;
		   return temp;
	}
	public static int getSum(int a,int b) {
		   int sum=a+b;
		   return sum;
	}
	public static int getLeft(int c) {
		   return c<<5;
	}

}
