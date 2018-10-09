package chapter2;
public class Chapter2_7_3 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	       int[][]arr=new int[3][];
	       int[][]arr1=new int[3][4];
	       int[][]arr2= {{1,2,3},{3,2,1},{4,5,2}};
	       int a=1;
           for(int i=0;i<arr2.length;i++) {
		       System.out.println("ตฺ"+a+"ื้");
    	       for(int j=0;j<arr2.length;j++) {
    		       System.out.print(arr2[i][j]+",");
    	       }
    	       System.out.print("\n");
    	       a+=1;
           }
	}
}
