package chapter2;
public class Chapter2_6_3 {
	public static void main(String[] args) {//���õݹ鷽��
		  int sum=getSum(4); 
		  System.out.println(sum);
	}
    public static int getSum(int n) {//�����ݹ�
    	if(n==1) {
    		return 1;
    	}
    	   int temp=getSum(n-1);
    	   return temp+n;
    }
}
