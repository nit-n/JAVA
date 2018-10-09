package chapter7;

import java.util.ArrayList;

public class chapter7_2_2 {
	public static void main(String[] args) {
        ArrayList arr=new ArrayList();
	    for(int i=1;i<4;i++) {
	    	arr.add("date"+i);
	    }
	    for(Object obj:arr) {
	    	System.out.println(obj);
	    }
	    //增强for循环在遍历数组时不能对数组进行修改
	}
}
