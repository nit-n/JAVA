package chapter2;
public class Chapter2_3_3{
	public static void main(String[] args) {
		   boolean a,b;
		   a=true;
		   b=false;
		   System.out.println(a&b);	// 与运算
		   System.out.println(a&&b);//逻辑与
		   System.out.println(a|b);//或运算
		   System.out.println(a||b);//逻辑或		   
		   System.out.println(!b);// 非运算
		   System.out.println("非a"+" :"+!a);//非运算
		   System.out.println(a^b);//异或
		   int x=0;
		   int y=0;
		   boolean c=x==0||y>0;
		   System.out.println("逻辑或运算得出:"+c);
	}

}
