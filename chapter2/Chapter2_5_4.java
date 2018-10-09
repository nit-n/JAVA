package chapter2;
public class Chapter2_5_4 {
	public static void main(String[] args) {
		   int i,j;
		   for(i=1;i<=9;i++){  //打印正三角
			   for(j=1;j<=i;j++) {
				   System.out.print("*");
			   }
			   System.out.print("\n");
		   }
		   s();  //调用静态方法
	}
	public static void s(){  //打印倒三角
		int i1,j1;
		for(i1=1;i1<=9;i1++) {
			for(j1=9;j1>=i1;j1--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
