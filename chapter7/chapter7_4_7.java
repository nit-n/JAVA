package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class chapter7_4_7 {
	public static void main(String[] args) {
        Map m=new HashMap();
        m.put("1","jack");
        m.put("2","jack2");
        m.put("3","jack3");
        m.put("4","jack4");
        m.put("1","jack4");
		Set s=m.entrySet();//获取整个集合的映射关系
		Iterator i=s.iterator();
		while(i.hasNext()) {
			Map.Entry en=(Map.Entry) (i.next());
            System.out.println(en.getKey()+":"+en.getValue());
		}
	}
}
