package chapter6;

public class chapter6_3_1 {
	public static void main(String[] args) throws Exception{
		System.out.println("计算绝对值的结果:"+Math.abs(-1));
		System.out.println("求大于参数的最小整数:"+Math.ceil(5.6));
		System.out.println("求小于参数的最大整数:"+Math.floor(-4.2));
		System.out.println("对小数进行四舍五入的结果:"+Math.round(-4.51));//大于5则如小于或等于则舍
		System.out.println("对小数进行四舍五入的结果:"+Math.round(-4.5));
		System.out.println("求2个数的较大值:"+Math.max(2,3));
		System.out.println("求2个数的较小值:"+Math.min(1,2));
		System.out.println("生成一个大于等于0.0小于1.0的随机值:"+Math.random());
	}
}
