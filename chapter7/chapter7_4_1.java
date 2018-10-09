package chapter7;

import java.util.HashSet;
import java.util.Iterator;

public class chapter7_4_1 {
	public static void main(String[] args) {
        HashSet hs=new HashSet();//Set集合的分支使用哈希值来完成数据的存取和查找,该集合不能有重复元素
        for(int i=1;i<5;i++) {
        	hs.add("date"+i);
        }
        Iterator iter=hs.iterator();
	    while(iter.hasNext()) {
	    	System.out.println(iter.next());
	    }
	    System.out.println(hs);
	}
}
