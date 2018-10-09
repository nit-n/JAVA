package chapter6;

import java.util.Random;
public class chapter6_3_2 {
	public static void main(String[] args) {
		Random r=new Random();
		Random r1=new Random(2);
		System.out.println("不传入种子参数:");
		for(int i=0;i<10;i++) {
			System.out.println(r.nextInt(100));
		}
		System.out.println("传入种子参数后:");
		for(int i=0;i<10;i++) {
			System.out.println(r1.nextInt(100));
		}
	}
}
