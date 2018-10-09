package chapter4;
public class chapter47_3 {
	public static void main(String[] args) {
		Player p=new Player();
		p.play(11);
	}
}
@SuppressWarnings("serial")
class NoThisSoundException extends Exception{
	public  NoThisSoundException() {
		super();
	}
	public NoThisSoundException(String string) {
		super();
		System.out.println(string);
	}
}
class Player{
	public void play(int index){
		try {
			if(index>10)throw new NoThisSoundException("�����ŵĸ���������");
		} catch (NoThisSoundException e) {
			new NoThisSoundException().getMessage();;
		}
	}
}