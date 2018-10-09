package chapter5;

public class Chapter5_5_9 {
	public static void main(String[] args) {//创建10个线程实现1-100累加
        	t t=new t();
        	t t1=new t();
        	t t2=new t();
        	t t3=new t();
        	t t4=new t();
        	t t5=new t();
        	t t6=new t();
        	t t7=new t();
        	t t8=new t();
        	t t9=new t();
        	System.out.println(t.t()+t1.t1()+t2.t2()+t3.t4()+t4.t5()+t5.t6()+t6.t7()+t7.t8()+t8.t9()+t9.t10());
	}
	public static class t{
        public int t(){
        	int j=1;
        	for(int i=2;i<=10;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t1(){
        	int j=11;
        	for(int i=12;i<=20;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t2(){        	
        	int j=21;
        	for(int i=22;i<=30;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t4(){        	
        	int j=31;
        	for(int i=32;i<=40;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t5(){        	
        	int j=41;
        	for(int i=42;i<=50;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t6(){        	
        	int j=51;
        	for(int i=52;i<=60;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t7(){        	
        	int j=61;
        	for(int i=62;i<=70;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t8(){        	
        	int j=71;
        	for(int i=72;i<=80;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t9(){        	
        	int j=81;
        	for(int i=82;i<=90;i++) {
        		j=j+i;
        	}
			return j;
        }
        public int t10(){        	
        	int j=91;
        	for(int i=92;i<=100;i++) {
        		j=j+i;
        	}
			return j;
        }
	}
}
