
public class StringDisplay extends AbstractDisplay{
	private String string;
	private int width;
	
	public StringDisplay(String string) {
		this.string = string;
		this.width = string.length();
	}

	@Override
	public void open() {
		printLine();
	}

	@Override
	public void print() {
		System.out.println("|" + string + "|");
	}

	@Override
	public void close() {
		printLine();
	}
	
	private void printLine() {
		StringBuilder str = new StringBuilder();
		str.append("+");
		for(int i = 0; i < width; i++) {
			str.append("-");
		}
		str.append("+");
		System.out.println(str);
	}
}
