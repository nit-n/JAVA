package chapter2;
public class Chapter2_7_2 {
	public static void main(String[] args) {
		   int[]arr= {6,4,5,10,1,2,3,14,15,16};
		   System.out.println("��ӡһ������");
		   for(int i = 0;i<=arr.length-1;i++) {
			   if(i==0) {
				   System.out.print("["+arr[i]+",");
			   }else if(i<arr.length-1){
				   System.out.print(arr[i]+",");
			   }else if(i==arr.length-1)
			   System.out.println(arr[i]+"]");
		   }
		   System.out.print("��ӡһ�����ֵ:");
		   int a1=getMax(arr);
		   System.out.println(a1);
	}

	public static int getMax(int []arr) {//����һ����̬�������ڻ�ȡ��������ֵ
		int a=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(a<arr[i]) {//�����һ��������ǰһ������ô�ͽ���һ������ֵ����ǰһ����
				a=arr[i];
			}
		}
		return a;
	}

}
