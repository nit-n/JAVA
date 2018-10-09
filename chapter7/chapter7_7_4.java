package chapter7;

import java.util.Arrays;

public class chapter7_7_4 {
	public static void main(String[] args) {
		int []a={1,2,3,4};
		int []b={5,6,7,8};
		int []c=Arrays.copyOf(a,a.length);
		int []d=Arrays.copyOf(b,b.length);
		print(c);
		print(d);
		Arrays.fill(a,90);
		print(a);
		System.out.println(Arrays.toString(a));
	}
	public static void print(int [] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
}
