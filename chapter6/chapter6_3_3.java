package chapter6;

import java.util.Random;

public class chapter6_3_3 {
	public static void main(String[] args) {
        Random r1=new Random();
        System.out.println("float类型的随机数:"+r1.nextFloat());
        System.out.println("double类型的随机数:"+r1.nextDouble());
        System.out.println("int类型的随机数:"+r1.nextInt());
        System.out.println("long类型的随机数:"+r1.nextLong());
	}
}
