package chapter2;
public class Chapter2_7_2_3 {
	public static void main(String[] args) {
		   int[] arr= {36,43,26,235,34,431};
		   System.out.println("排序前:");
		   printArray(arr);
		   System.out.println("排序后:");
		   arraySort(arr);
		   printArray(arr);
	}
    public static void printArray(int[] arr) {//自定义一个打印数组元素的方法
    	   for(int i=0;i<arr.length;i++) {
    		   if(i==arr.length-1) {
    			   System.out.println(arr[i]);
    		   }else {
    		   System.out.print(arr[i]+",");
    		   }
    	   }
    }
    public static void arraySort(int[] arr) {
    	   for(int i=0;i<arr.length-1;i++) {
    		   for(int j=0;j<arr.length-1;j++) {//倒数第2个下标与最后一个下标相比较
    			   if(arr[j]>arr[j+1]) {//若后一个比前一个大则换位子
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
    			   }
    		   }
    	   }
    }
}