package chapter7;
import java.util.ArrayList;
import java.util.Collections;
public class chapter7_7_2 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Collections.addAll(list,"a","b","3c","2d","1e");
		System.out.println("集合:"+list);
		Collections.sort(list);
		System.out.println("使用二分法查找元素索引:"+Collections.binarySearch(list,"a"));
		System.out.println("查找最大:"+Collections.max(list));
		System.out.println("查找最小:"+Collections.min(list));
		System.out.println("全部替换:"+Collections.replaceAll(list,"1e","e1"));
		System.out.println(list);
	}
}
