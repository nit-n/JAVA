package chapter7;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class chapter7_4_5 {
	public static void main(String[] args) {
	    //将自定义的比较器在创建TreeSet集合时传入
        TreeSet ts=new TreeSet(new MyComparator());
	    ts.add(" 1231231   12213");
	    ts.add(" 1231231   ");
	    ts.add(" 1231231   11");
        Iterator iterator= ts.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
}
class MyComparator implements Comparator{
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		int temp=s1.length()-s2.length();
		return temp;
		
	}
}

