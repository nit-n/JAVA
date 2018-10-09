package chapter7;

import java.util.Iterator;
import java.util.TreeSet;

public class chapter7_4_4 {
	public static void main(String[] args) {
        TreeSet ts=new TreeSet();
        ts.add(new stud("tom",17));
        ts.add(new stud("jack",18));
        ts.add(new stud("bill",18));
        ts.add(new stud("ross",18));
        ts.add(new stud("tom",18));
        Iterator iterator= ts.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
	}
}
class stud implements Comparable{
	String name;
	int age;
	public stud() {}
	public stud(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public String toString() {
		return name+":"+age;
	}
	public int compareTo(Object o) {
		stud s=(stud) o;
		if(this.age-s.age>0) {
			return 1;
		}
		if(this.age-s.age==0) {
			return this.name.compareTo(s.name);
		}
		return -1;
	}
}