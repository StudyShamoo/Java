
public interface AbstractDisplayInter {
	// open, print, close はサブクラスに実装を任せる抽象メソッド
	void open();
	void print();
	void close();
	
	// displayはAbstractDisplayInterで実装しているdefaultメソッド
	public default void display() {
		open();
		for(int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
