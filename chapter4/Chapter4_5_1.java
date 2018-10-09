package chapter4;
public class Chapter4_5_1 {
	public static void main(String[] args) {
           try {
        	   int result=divide(4,-2);
           }catch(DivideByMinusException e) {
        	     System.out.println(e.getMessage());
           }
	}
    public static int divide(int x,int y) throws DivideByMinusException{
           if(y<0) {
        	 throw new DivideByMinusException("被除数是负数");
           }
           int result=x/y;
           return result;
    }
}
class DivideByMinusException extends Exception{
    public DivideByMinusException() {
	          super();
    }
    public DivideByMinusException(String message) {
	          super(message);
    }
}