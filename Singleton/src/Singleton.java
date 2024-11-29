
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		System.out.println("インスタンスを生成しました。");
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}

/*
 * enumとSingleton
 * 
 * enumは定数としてインスタンスの唯一性が担保される。
 * java.time.Month.APRILは４月を表すシステム内でたった一つだけ生成されるインスタンス
 */

enum Singleton_enum {
	INSTANCE_NAME;
	public void hello() {
		System.out.println("こんにちは。");
	}
}