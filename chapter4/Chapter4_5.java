package chapter4;
public class Chapter4_5 {
	public static void main(String[] args)throws Exception{
	       try {
 		       int result=d(4,0);
 		       m1();
           }catch(Exception e){
     	       System.out.println("被除数不能为0");  
           }finally {
               System.out.println("无论程序是否发生异常finally代码块都会执行");
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