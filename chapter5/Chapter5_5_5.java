package chapter5;
public class Chapter5_5_5 {//使用线程进行数据存取模拟
	public static void main (String[]args){
		   Storage s=new Storage();       
		   Input i=new Input(s);
		   Output o=new Output(s);
		   new Thread(i).start();
		   new Thread(o).start();
	}
	
}
class Input implements Runnable{
	  private Storage st;
	  private int num;
	  Input(Storage st){
		  this.st=st;
	  }
	  public void run() {
		     while(true) {
		    	 st.put(num++);
		     }
	  }
}
class Output implements Runnable{
	  private Storage st;
	  Output(Storage st){
		  this.st=st;
	  }
	  public void run() {
		     while(true) {
		    	 st.get();
		     }
	  }
}
class Storage{
    private int [] cells =new int [10];
    private int inPos,outPos;          	
    private int count;			
    public synchronized void put (int num) {
 	       try {
 	    	  while(count==cells.length) {
 	    		  this.wait();
 	    	  }
 	    	  cells[inPos]=num;        
 	    	  System.out.println("��cells["+inPos+"]�з�������---"+cells[inPos]);
 	    	  inPos++;                 
 	    	  if(inPos==cells.length)inPos=0;
 	    	  count++;               
 	    	  this.notify();
 	          }catch(Exception e){
 	    		     e.printStackTrace();
 	    	 }
   }
   public synchronized void get() {
 	      try {
 	    	  while(count==0) {     
 	    		  this.wait();
 	    	  }
 	    	  int data=cells[outPos];
  	    	  System.out.println("��cells["+outPos+"]��ȡ������---"+data);
  	    	  cells[outPos]=0;      
  	    	  outPos++;             
  	    	  if(outPos==cells.length)outPos=0;
  	    	  count--;
  	    	  this.notify();
 	      }catch(Exception e) {
 	    	    e.printStackTrace();
 	      }
    }
}