import java.util.HashMap;

public class Main {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap();	
		HashMap<Integer, String> hashMap1 = new HashMap();	
		Integer key = 123;
		Integer key1 = 124;
		String value = "hello";
		Integer key2 = 213123;
		String value2 = "world";
		
		Integer key3 = 3213;
		String value3 = "dsdasdkkew";
		
		hashMap.put(key, value);
		hashMap.put(key1, value);
		hashMap.put(key2, value2);
		
		System.out.print(hashMap.toString() + "\n");
		
		hashMap1.put(key3, value3);
		hashMap.putAll(hashMap1);
		
		System.out.print(hashMap.toString());
	}
}
