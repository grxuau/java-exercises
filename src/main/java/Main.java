public class Main {
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyMap<Integer, String> map = new MyMap();
		Integer key = 123;
		Integer key1 = 124;
		String value = "hello";
		Integer key2 = 213123;
		String value2 = "world";
		
		//FIXME добавляется только последнее значение
		
		map.put(key, value);
		map.put(key1, value);
		map.put(key2, value2);
		
		System.out.print(map.toString());
	}
}
