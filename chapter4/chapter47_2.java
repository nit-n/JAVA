package chapter4;

public class chapter47_2 {
	public static void main(String[] args) {
		Square squ=new Square();
		Circle cir=new Circle();
		System.out.println(squ.area(2));
		System.out.println(cir.area(3));
	}
}
interface Shape{
	abstract double area(double d);
}
class Square implements Shape{
	public double area(double d) {
		double Square=d*d;
		return Square;
	}
}
class Circle implements Shape{
	public double area(double d) {
		double Circle=d*d*Math.PI;
		return Circle;
	}
}