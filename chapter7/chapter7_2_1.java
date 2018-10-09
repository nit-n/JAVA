package chapter7;

import java.util.ArrayList;
import java.util.Iterator;

public class chapter7_2_1 {
	public static void main(String[] args) {
        ArrayList l=new ArrayList();
        for(int i=1;i<5;i++) {
        	l.add("date"+i);
        }
        Iterator i=l.iterator();//调用ArrayList的iterator()方法获取循环迭代器
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}
}
