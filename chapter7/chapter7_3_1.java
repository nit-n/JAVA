package chapter7;

import java.util.ArrayList;
import java.util.Iterator;

public class chapter7_3_1 {
    public static void main(String[]args) {
        ArrayList l=new ArrayList();
        for(int i=1;i<5;i++) {
        	l.add("date"+i);
        }
        Iterator i=l.iterator();//调用ArrayList的iterator()方法获取循环迭代器
        while(i.hasNext()) {
        	if("date3".equals(i.next())) {
        		i.remove();//调用迭代器的删除方法或者使用ArrayList的remove方法删除后跳出循环
        	}
        }
    	System.out.println(l);
    }
}
