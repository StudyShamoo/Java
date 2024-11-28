package adapter2;

/*
 * 提供されたAPI(Banner)と必要とするインターフェース(Print)を
 * 適合(adapt)させるクラス。Adapterと呼ばれる。
 */
public class PrintBanner extends Print{
	private Banner banner;
	
	public PrintBanner(String str) {
		banner = new Banner(str);
	}

	@Override
	public void printWeak() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}
	
}
