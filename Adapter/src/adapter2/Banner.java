package adapter2;

// あらかじめ提供されているAPIのようなものとして考える
public class Banner {
	private String str;
	
	public Banner(String str) {
		this.str = str;
	}
	
	public void showWithParen() {
		System.out.println("(" + str + ")");
	}
	
	public void showWithAster() {
		System.out.println("***" + str + "***");
	}
}
