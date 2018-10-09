package chapter7;
import java.util.*;
public class chapter7_5_2 {
	public static void main(String[] args) {
	    TreeMap ts=new TreeMap(new MyComparable());
	    ts.put("1","jack");
	    ts.put("12","back");
	    ts.put("13","dack");
	    ts.put("14","ack");
	    Set KeySet=ts.keySet();
	    Iterator it=KeySet.iterator();
	    while(it.hasNext()) {
	    	Object key=it.next();
	    	System.out.println(key+":"+ts.get(key));
	    }
	}
}
class MyComparable implements Comparator{//自定义比较器
	public int compare(Object o1, Object o2) {
        String id1=(String)o1;
        String id2=(String)o2;
		return id2.compareTo(id1);
	}
}