package chapter7;

import java.util.LinkedList;

public class chapter7_1_2 {
	public static void main(String[] args) {
        LinkedList l=new LinkedList();//双向循环链表
        for(int i=0;i<5;i++) {
        	l.add("stu"+i);
        }
        System.out.println(l.toString());
        l.add(3,"index3");
        l.addFirst("First1");
        System.out.println(l);
        System.out.println(l.getFirst());
        l.remove(3);
        l.removeFirst();
        System.out.println(l);
	}
}
