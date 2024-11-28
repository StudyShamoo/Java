import framework.Factory;
import framework.Product;
import idcard.IDCardFactory;

public class FactoryMethodTester {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.create("Oka Shouta");
		Product card2 = factory.create("Sato Syuya");
		Product card3 = factory.create("Shamoo");
		card1.use();
		card2.use();
		card3.use();
		
		((IDCardFactory)factory).printAll();
	}

}
