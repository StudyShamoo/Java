import framework.Manager;
import framework.Product;

public class PrototypeTester {

	public static void main(String[] args) {
		// インスタンス生成
		Manager manager = new Manager();
		UnderlinePen upen = new UnderlinePen('-');
		MessageBox mbox = new MessageBox('*');
		MessageBox sbox = new MessageBox('/');
		
		// managerに登録
		manager.register("Strong Message", upen);
		manager.register("Warning Box", mbox);
		manager.register("Slash Box", sbox);
		
		// 生成と利用
		Product p1 = manager.create("Strong Message");
		p1.use("Hello World!");
		
		Product p2 = manager.create("Warning Box");
		p2.use("Hello world");
		
		Product p3 = manager.create("Slash Box");
		p3.use("hello wprld");
		
	}

}
