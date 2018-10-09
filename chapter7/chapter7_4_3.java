package chapter7;

import java.util.Iterator;
import java.util.TreeSet;

public class chapter7_4_3 {
	public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        for(int i=5;i>0;i--) {
        	ts.add("date"+i);
        }
        Iterator iterator= ts.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
}
