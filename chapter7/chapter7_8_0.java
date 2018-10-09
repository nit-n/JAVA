package chapter7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class chapter7_8_0 {
	public static void main(String[] args) {
		System.out.println("------------------");
		ques1();
		System.out.println("------------------");
		ques2();
		System.out.println("------------------");
		ques3();
	}
	public static void ques1() {
		ArrayList a=new ArrayList();
		for(int i=0;i<10;i++) {
			a.add("date"+i);
		}
		Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void ques2() {
		HashSet h=new HashSet();
		h.add(new Person(1,"ja"));
		h.add(new Person(2,"ja"));
		h.add(new Person(3,"ja"));
		h.add(new Person(3,"javv"));
		Iterator i=h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void ques3() {
		TreeMap t=new TreeMap();
        for(int i=0;i<5;i++){
        	t.put(i,"date"+i);
        }
        Set s=t.keySet();
        Iterator i=s.iterator();
        while(i.hasNext()) {
        	Object o=i.next();
        	System.out.println(o+":"+t.get(o));
        }
	}
}
class Person{
	int age;
	String name;
	public Person() {};
	public Person(int age,String name) {
		this.age=age;
		this.name=name;
	};
	//存储元素为对象时,默认打印调用toString()方法
		public String toString() {
			return age+":"+name;
		}
		public int hashCode() {
			return name.hashCode();
		}
		public boolean equals(Object obj) {
			if(this==obj) { //判断是否为同一个对象
				return true;
			}
			if(!(obj instanceof Person)) {
				return false;
			}
			Person s=(Person)obj;
		    boolean b=this.name.equals(s.name);//调用String类的equals()方法对该对象的id属性值进行判断若相同则返回true
		    return b;
		}
}