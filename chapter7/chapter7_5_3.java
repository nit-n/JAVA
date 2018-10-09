package chapter7;
import java.util.Enumeration;
import java.util.Properties;
public class chapter7_5_3 {
	public static void main(String[] args) {
        Properties p=new Properties();//Map--->HashTable(线程安全但存取速度比HashMap慢)--->Properties(存取字符串类型的键值)
	    p.setProperty("backgroup-color","red");
	    Enumeration names=p.propertyNames();
	    while(names.hasMoreElements()) {
	    	String key=(String) names.nextElement();
	    	String value=p.getProperty(key);
	    	System.out.println(key+"="+value);
	    }
	}
}
