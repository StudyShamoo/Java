import framework.Product;

public class UnderlinePen extends ConcreteProduct implements Product{
	private char ulchar;
	
	public UnderlinePen(char ulchar) {
		this.ulchar = ulchar;
	}
	
	public UnderlinePen(UnderlinePen prototype) {
		this.ulchar = prototype.ulchar;
	}
	
	@Override
	public void use(String s) {
		int ulen = s.length();
		System.out.println(s);
		for(int i = 0; i < ulen; i++) {
			System.out.print(ulchar);
		}
		System.out.println();
	}
	
	@Override
	public Product createCopy() {
		return new UnderlinePen(this);
	}
}
