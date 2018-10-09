package chapter7;
import java.util.ArrayList;
public class chapter7_6_1 {
	public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//泛型(取出集合元素时会默认恢复为Object类型，使用泛型则保证存入数据一致)
        list.add("S");
        list.add("St");
        list.add("Str");
        for(String s:list) {
        	System.out.println(s);
        }
	}
}
