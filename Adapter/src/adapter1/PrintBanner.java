package adapter1;

/*
 * 提供されたAPI(Banner)と必要とするインターフェース(Print)を
 * 適合(adapt)させるクラス。Adapterと呼ばれる。
 */
public class PrintBanner extends Banner implements Print{
	public PrintBanner(String str) {
		super(str);
	}

	@Override
	public void printWeak() {
		showWithParen();
	}

	@Override
	public void printStrong() {
		showWithAster();
	}
	
}
