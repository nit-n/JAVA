package chapter2;
public class Chapter2_5_4 {
	public static void main(String[] args) {
		   int i,j;
		   for(i=1;i<=9;i++){  //��ӡ������
			   for(j=1;j<=i;j++) {
				   System.out.print("*");
			   }
			   System.out.print("\n");
		   }
		   s();  //���þ�̬����
	}
	public static void s(){  //��ӡ������
		int i1,j1;
		for(i1=1;i1<=9;i1++) {
			for(j1=9;j1>=i1;j1--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
