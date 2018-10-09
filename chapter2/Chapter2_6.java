package chapter2;
public class Chapter2_6 {
	public static void main(String[] args){
		printRectangle(3,4);
		printRectangle(4,4);
		printRectangle(4,5);
	}		
	public static void printRectangle(int h,int w) {
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
