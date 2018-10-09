package chapter6;

public class chapter6_3_4 {
	public static void main(String[] args) {
        int a=20;
        byte b=20;
        char c='a';
        short s=2;
        long l=90;
        float f=9.0f;
        double d=8.0d;
        boolean bl=true;
        //装箱
        System.out.println("----------装箱--------");
        System.out.println(new Integer(a));
	    System.out.println(new Byte(b));
	    System.out.println(new Character(c));
	    System.out.println(new Short(s));
	    System.out.println(new Float(f));
	    System.out.println(new Double(d));
	    System.out.println(new Boolean(bl));
	    System.out.println("----------拆箱--------");
	    //拆箱
	    Integer a1=new Integer(a);
	    int a2=a1.intValue()+30;
	    System.out.println(a2);
	}
}
