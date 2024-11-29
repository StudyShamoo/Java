package singleton_prac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Triple {
	private static Map<String, Triple> map = new HashMap<>();
	
	static {
		String[] names = {"ALPHA", "BETA", "GAMMA"};
		Arrays.stream(names).forEach(s -> map.put(s, new Triple(s)));
	}
	
	private String name;
	
	private Triple(String name) {
		this.name = name;
	}
	
	public static Triple getInstance(String name) {
		return map.get(name);
	}
}

// enum版
enum Triple2{
	ALPHA, BETA, GAMMA;
	private Triple2() {
		
	}
	
	public static Triple2 getInstance(String name) {
		return valueOf(name);
	}
}