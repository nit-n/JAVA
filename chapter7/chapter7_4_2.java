package chapter7;

import java.util.HashSet;

public class chapter7_4_2 {
	public static void main(String[] args) {
        HashSet hs=new HashSet();
        Stu s1=new Stu("1","jack");
        Stu s2=new Stu("2","tom");
        Stu s3=new Stu("3","mary");
        Stu s4=new Stu("3","mary");
        hs.add(s4);
        hs.add(s3);
        hs.add(s2);
        hs.add(s1);
        System.out.println(hs);
	}
}
class Stu{
	String id;
	String name;
	public Stu(String id,String name) {
		this.id=id;
		this.name=name;
	}
	//存储元素为对象时,默认打印调用toString()方法
	public String toString() {
		return id+":"+name;
	}
	public int hashCode() {
		return id.hashCode();
	}
	public boolean equals(Object obj) {
		if(this==obj) { //判断是否为同一个对象
			return true;
		}
		if(!(obj instanceof Stu)) {
			return false;
		}
		Stu s=(Stu)obj;
	    boolean b=this.id.equals(s.id);//调用String类的equals()方法对该对象的id属性值进行判断若相同则返回true
	    return b;
	}
}