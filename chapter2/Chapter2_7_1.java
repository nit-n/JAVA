package chapter2;
public class Chapter2_7_1 {
	public static void main(String[] args) {
		   try {
			   int[]arr=new int[1];
			   System.out.println(arr[3]);
		   }catch(Exception e) {
			   System.out.println("访问的数组下标越界");
		   }
	}

}
