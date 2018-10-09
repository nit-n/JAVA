package chapter7;

import java.util.*;

public class chapter7_4_8 {
	public static void main(String[] args) {
		Map m=new HashMap();
        m.put("1","jack");
        m.put("2","jack2");
        m.put("3","jack3");
        m.put("4","jack4");
        Collection va=m.values();//获取列表值的集合
        Iterator i=va.iterator();
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
	}
}
