package chapter4;
public class Chapter4_5 {
	public static void main(String[] args)throws Exception{
	       try {
 		       int result=d(4,0);
 		       m1();
           }catch(Exception e){
     	       System.out.println("����������Ϊ0");  
           }finally {
               System.out.println("���۳����Ƿ����쳣finally����鶼��ִ��");
		   }      
	}
    public static int d(int x,int y) {
    	   int result=x/y;
    	   return result;
    }
    public static void m1(){
    	   int result=d(10,0);
    }
}