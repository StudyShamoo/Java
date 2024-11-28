package idcard;

import java.util.HashMap;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory{
	private HashMap<String, IDCard> compChart = new HashMap<>();
	private static int idnum = 0;

	@Override
	protected synchronized Product createProduct(String owner) {
		IDCard idCard = new IDCard(owner);
		idnum++;
		compChart.put(String.format("%3d", idnum), idCard);
		return idCard;
	}

	@Override
	protected void registerProduct(Product product) {
		System.out.println(product + "を登録しました。");
	}
	
	// 通し番号を知るためのテスト的なメソッド
	public void printAll() {
		for(String idn : compChart.keySet()) {
			System.out.println("番号 " + idn + " : " + compChart.get(idn));
		}
	}
}
