package chapter2;
public class Chapter2_5_3 {
	public static void main(String[] args) {
		   int sum=0;
		   long time=System.currentTimeMillis();//��ȡ����ʼ���е�ϵͳʱ��
		   for(int i=0;i<=500;i++){    //����ʵ���ۼ�
			   sum+=i;
		   }
		   long time1=System.currentTimeMillis();//��ȡ����������ʱ��
		   System.out.println(time1-time);
		   System.out.println(sum);
	}
}
