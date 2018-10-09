package chapter2;
public class ex1 {                              
		 public static void main(String[] args) { 
		        for(int n=1;n<=100;n++){        
		        	boolean b = true;
		           if(n!= 1){                   
		              for(int i=2;i<n;i++){     
		                 if(n%i==0){            
		                    b=false;            
		                    break;
		                 }
		              }
			       if(b){                       
				     System.out.println(n);
				     }
		          }
		       }
        }
}


