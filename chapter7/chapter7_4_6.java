package chapter7;
import java.util.*;
public class chapter7_4_6 {
	public static void main(String[] args) {
        Map m=new HashMap();
        m.put("1","jack");
        m.put("2","jack2");
        m.put("3","jack3");
        m.put("4","jack4");
        m.put("1","jack4");
        Set key=m.keySet();//获取整个集合的键值的集合
        Iterator i=key.iterator();
        while(i.hasNext()) {
        	Object v=m.get(i.next());
        	System.out.println(v);
        }
	}
}
