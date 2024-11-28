
public class TempleteMethodTester {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		AbstractDisplay d1 = new CharDisplay('A');
		AbstractDisplay d2 = new StringDisplay("Hello, World!");
		
		d1.display();
		d2.display();
	}

}
