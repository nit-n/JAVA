package chapter4;
public class Chapter4_2 {
	public static void main(String[] args) {
		   final int num=2;
		 //num=4;  编译报错 ,final关键字修饰的常量只能赋值一次
	final String name;//使用fianl关键字时,虚拟机不能对其进行初始化
	}
}
final class Animal2{
	  public final void shout() {
	  }
}
/* class Dog extends Animal2{
         public void shout(){
         }
}   被final关键字所修饰的类无法继承,所以该行编译报错*/