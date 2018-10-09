package chapter3;
/**
 * Title:Person类<br>
 * Description:通过Person类来说明java中的文档注释<br>
 * Company:Itcast
 * @author asus
 * @version 8.0
 */
class Person10{
	  public String name;
	  /**
	   * 这是Person类的构造方法
	   * @param name Person的名字
	   */
	  public Person10 (String name) {}
	  /**
	   * 这是read()方法的说明
	   * @param bookName读的书的名字
	   * @param time 读书所需的时间
	   * @return 读的书的数量
	   */
	  public int read(String bookName,int time) {
		     //执行语句;
		     int i=0;
		     i=time;
		     return i;
	  }

}