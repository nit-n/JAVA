package chapter2;
public class Chapter2_7 {
	public static void main(String[] args) {
		   int[] arr=new int[4];
		   System.out.println(arr[0]);
		   System.out.println(arr[1]);
		   System.out.println(arr[2]);
		   System.out.println(arr[3]);
		   arr[0]=-1;
		   arr[1]=1;
		   arr[2]=2;
		   arr[3]=3;
		   System.out.println("赋值后的数组:");
		   System.out.println(arr[0]);
		   System.out.println(arr[1]);
		   System.out.println(arr[2]);
		   System.out.println(arr[3]);
		   System.out.print("数组长度:");		   
		   System.out.println(arr.length);
		   int[] arr1= {1,2,3,4};
		   System.out.println(arr1[0]);
		   System.out.println(arr1[1]);
		   System.out.println(arr1[2]);
		   System.out.println(arr1[3]);
	}

}
