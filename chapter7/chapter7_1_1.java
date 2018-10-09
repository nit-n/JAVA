package chapter7;

import java.util.ArrayList;

public class chapter7_1_1 {
	public static void main(String[] args) {
        ArrayList a=new ArrayList();
        for(int i=0;i<5;i++) {
        	a.add("stu"+i);
        }
        System.out.println("集合的长度:"+a.size());
        System.out.println("指定位置的元素:"+a.get(1));
	}
}
