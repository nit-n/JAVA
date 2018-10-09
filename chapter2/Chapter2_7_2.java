package chapter2;
public class Chapter2_7_2 {
	public static void main(String[] args) {
		   int[]arr= {6,4,5,10,1,2,3,14,15,16};
		   System.out.println("打印一个数组");
		   for(int i = 0;i<=arr.length-1;i++) {
			   if(i==0) {
				   System.out.print("["+arr[i]+",");
			   }else if(i<arr.length-1){
				   System.out.print(arr[i]+",");
			   }else if(i==arr.length-1)
			   System.out.println(arr[i]+"]");
		   }
		   System.out.print("打印一个最大值:");
		   int a1=getMax(arr);
		   System.out.println(a1);
	}

	public static int getMax(int []arr) {//定义一个静态方法用于获取数组的最大值
		int a=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(a<arr[i]) {//如果后一个数大于前一个数那么就将后一个数的值赋给前一个数
				a=arr[i];
			}
		}
		return a;
	}

}
