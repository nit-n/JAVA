package chapter6;

public class chapter6_2_2 {
	public static void main(String[] args) {
        long s=System.currentTimeMillis();
        int sum=0;
        for(int i=0;i<10000000;i++) {
        	sum+=i;
        }
        long e=System.currentTimeMillis();
        System.out.println("循环所用时间:"+(e-s)+"毫秒");
	}
}
