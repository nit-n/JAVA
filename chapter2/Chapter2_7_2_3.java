package chapter2;
public class Chapter2_7_2_3 {
	public static void main(String[] args) {
		   int[] arr= {36,43,26,235,34,431};
		   System.out.println("����ǰ:");
		   printArray(arr);
		   System.out.println("�����:");
		   arraySort(arr);
		   printArray(arr);
	}
    public static void printArray(int[] arr) {//�Զ���һ����ӡ����Ԫ�صķ���
    	   for(int i=0;i<arr.length;i++) {
    		   if(i==arr.length-1) {
    			   System.out.println(arr[i]);
    		   }else {
    		   System.out.print(arr[i]+",");
    		   }
    	   }
    }
    public static void arraySort(int[] arr) {
    	   for(int i=0;i<arr.length-1;i++) {
    		   for(int j=0;j<arr.length-1;j++) {//������2���±������һ���±���Ƚ�
    			   if(arr[j]>arr[j+1]) {//����һ����ǰһ������λ��
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
    			   }
    		   }
    	   }
    }
}