package chapter7;
import java.util.*;
public class chapter7_7_1 {//Collections的常用方法
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		Collections.addAll(l,"s","1","2","3","4");//将制定元素添加到对应的集合中
		System.out.println("原集合:"+l);
		Collections.reverse(l);
		System.out.println("原集合反转:"+l);
		Collections.sort(l);
		System.out.println("原集合排序:"+l);
		Collections.swap(l,1,4);
		System.out.println("元素交换:"+l);
		Collections.shuffle(l);
		System.out.println("模拟洗牌:"+l);
	}
}
