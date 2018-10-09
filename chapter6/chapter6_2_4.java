package chapter6;
import java.io.*;
public class chapter6_2_4 {
	public static void main(String[] args) throws Exception{
        Runtime t=Runtime.getRuntime();
        System.out.println("处理器个数:"+t.availableProcessors());
        System.out.println("空闲内存数量:"+t.freeMemory()/1024/1024+"M");
        System.out.println("最大内存数量:"+t.maxMemory()/1024/1024+"M");
        Process p=t.exec("notepad.exe");//用于启动windos自带程序或者已经配置好路径的程序
	    Thread.sleep(3000);
	    p.destroy();
	}
}
