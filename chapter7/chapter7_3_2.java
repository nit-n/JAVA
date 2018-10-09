package chapter7;

import java.util.ArrayList;
import java.util.ListIterator;

public class chapter7_3_2 {
	public static void main(String[] args) {
        ArrayList l=new ArrayList();
        for(int i=1;i<5;i++) {
        	l.add("date"+i);
        }
        System.out.println(l);
        ListIterator li=l.listIterator();//逆向迭代器,根据调用方法传入参数初始化起始下标
	    while(li.hasNext()) {
	    	System.out.print(li.next()+" ");
	    }
	    System.out.println();
	    System.out.println("逆向遍历:");
	    while(li.hasPrevious()) {
	    	System.out.print(li.previous()+" ");
	    }
	}
}
