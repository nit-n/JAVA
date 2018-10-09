package chapter7;
import java.util.Arrays;
public class chapter7_7_3 {
	public static void main(String[] args) {
		int [] array= {5,3,5,4,5,1,2,3,4,54,345,435,3456,75645,867542,234,123,4124124,12431512,125124,135135};
		long l=System.currentTimeMillis();
		print(array);
		Arrays.sort(array);//直接调用Arrays工具类的排序方法
		print(array);
		long l1=System.currentTimeMillis();
		System.out.println("排序所用时间:"+(l1-l));
		System.out.println("首次出现3的索引位置:"+Arrays.binarySearch(array,3));
	}
	public static void print(int [] array) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+",");
		}
		System.out.println();
	}
}
