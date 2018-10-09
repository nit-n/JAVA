package chapter7;
import java.util.Enumeration;
import java.util.Vector;
public class chapter7_3_3 {
	public static void main(String[] args) {
        Vector v=new Vector();//线程安全的集合
        for(int i=1;i<5;i++) {
        	v.add("date"+i);
        }
        Enumeration e=v.elements();//获取该集合自带的迭代器
        while(e.hasMoreElements()) {
        	System.out.println(e.nextElement());
        }
	}
}
