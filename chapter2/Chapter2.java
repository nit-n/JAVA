package chapter2;
public class Chapter2 {
	public static void main(String[] args) {
           one();
           one1();
           int t=two(-3);
           System.out.println(t);
           three();
	}
	public static void one() {
		   int sum=0;
		   for(int i=1;i<100;i++) {
			  sum+=i;
			  i++;
		   }
		   System.out.println(sum);
	}
	public static void one1() {//�ۼ�
		   int sum=0;
		   for(int i=1;i<100;i++) {
			   if(i%2==1) {//ȡ��2������Ϊ1��
				   sum+=i;
			   }
			   i++;
		   }
		   System.out.println(sum);
	}
	public static int two(int x) {//����
		   int y = 0;
		   if(x>0) {
			   y=x+3;
		   }else if(x==0) {
			   y=0;
		   }else if(x<0) {
			   y=x*x-1;
		   }
		   return y;
	}
	public static void three() {//���򷽷�
		   int []x= {25,24,12,76,101,96,28};
		   System.out.print("����ǰ");
		   three1(x);//���ô�ӡ����
		   for(int i=0;i<x.length;i++) {
			   for(int j=0;j<x.length-1;j++) {
				   if(x[j]>x[j+1]) {
					   int temp=x[j+1];
					   x[j+1]=x[j];
					   x[j]=temp;
				   }
			   }
		   }
		   System.out.print("�����");
		   three1(x);//���ô�ӡ����
	}
	public static void three1(int[]x) {//��ӡ����
		   for(int i=0;i<x.length;i++) {
			   System.out.print(x[i]+",");
		   }
	}
}
