package chapter2;
public class Chapter2_6_2 {//·½·¨ÖØÔØ
	public static void main(String[] args) {
		int sum=add(3,4);
		int sum1=add(3,4,5);
		double sum2=add(3.5,4.5);
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
	}
    public static int add(int x,int y) {
    	int a=x+y;
    	return a;
    }
    public static int add(int x,int y,int z) {
    	int a=x+y+z;
    	return a;
    }
    public static double add(double x,double y) {
    	double a=x+y;
    	return a;
    }
}
