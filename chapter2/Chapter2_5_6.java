package chapter2;
public class Chapter2_5_6 {
	public static void main(String[] args) {  //����һ����������ʵ��100���ڵ������ۼ�
		   int sum=0;
		   for(int i=0;i<=100;i++) {
			   if(i%2==0) {
				   continue; //������ż��ʱ�����ۼ�
			   }
			   sum+=i;
		   }
		   System.out.println(sum);
		   s1();
	}
	public static void s1(){ //����һ����������ʵ��100���ڵ�ż���ۼ�
		   int sum1=0;
		   for(int j=0;j<=100;j++) {
			   if(j%2==1) {
				   continue;//����������ʱ�����ۼ�
			   }
			   sum1+=j;
		   }
		   System.out.println(sum1);
	}

}
