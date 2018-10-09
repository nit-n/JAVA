package chapter6;
public class chapter6_2_3 {
	public static void main(String[] args) {
    int [] f= {1,5,6,8,9,1,6,1,3};
    int [] tf= {203,502,101,102,103,104};
    System.arraycopy(f,2,tf,2,4);//参数依次为源数组，源数组起始位置，目标数组，目标数组起始位置，拷贝数组元素个数
    for(int i=0;i<tf.length;i++) {
    	System.out.println(i+":"+tf[i]);
    }
	}
}
