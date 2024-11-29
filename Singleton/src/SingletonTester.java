
public class SingletonTester {

	public static void main(String[] args) {
		System.out.println("Start.");
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("obj1とobj2は同じインスタンスを参照しています。");
		}else {
			System.out.println("obj1とobj2は異なるインスタンスを参照しています。");
		}
		System.out.println("End.\n\n\n");
		
		Singleton_enum.INSTANCE_NAME.hello();
	}

}
