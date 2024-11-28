
public class CharDisplay extends AbstractDisplay{

	private char ch;
	
	public CharDisplay(char ch) {
		this.ch = ch;
	}
	
	@Override
	public void open() {
		// 開始文字列として"<<"を表示する
		System.out.print("<<");
	}

	@Override
	public void print() {
		// フィールドに保存された文字を表示する。
		System.out.print(ch);
	}

	@Override
	public void close() {
		// 終了文字列として">>"を表示する
		System.out.println(">>");
	}
	
}
