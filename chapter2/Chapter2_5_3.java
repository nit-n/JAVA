package chapter2;
public class Chapter2_5_3 {
	public static void main(String[] args) {
		   int sum=0;
		   long time=System.currentTimeMillis();//获取程序开始运行的系统时间
		   for(int i=0;i<=500;i++){    //用于实现累加
			   sum+=i;
		   }
		   long time1=System.currentTimeMillis();//获取结束的运行时间
		   System.out.println(time1-time);
		   System.out.println(sum);
	}
}
