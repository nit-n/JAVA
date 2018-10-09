package chapter7;
import java.util.*;
public class chapter7_5_1 {
	public static void main(String[] args) {
		Map m=new LinkedHashMap();//创建HashMap的子类对象来遍历与存入顺序相同的键，值
        m.put("3","jack3");
        m.put("4","jack4");
        m.put("1","jack");
        m.put("2","jack2");
        Set s=m.keySet();
        Iterator i=s.iterator();
        while(i.hasNext()) {
        	Object key=i.next();
        	Object value=m.get(key);
        	System.out.println(key+":"+value);
        }
	}
}
