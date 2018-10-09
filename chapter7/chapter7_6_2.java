package chapter7;
public class chapter7_6_2 {
	public static void main(String[] args) {
        Cach<Integer>p=new Cach<Integer>();
        p.save(new Integer(1));
        Integer temp=p.get();
        System.out.println(temp);
	}
}
class Cach<T>{			//自定义泛型
	T temp;
	public void save(T temp) {
		this.temp=temp;
	}
	public T get(){
		return temp;
	}
}