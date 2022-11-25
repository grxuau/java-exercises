public class Main {
	
	
	public static void main(String[] args) {
		Integer firstKey = 0143;
		Integer secondKey = 1363;
		
		String firstValue = "Witcher";
		String secondValue = "Skyrim";
		
		MyMap<Integer, String> map = new MyMap<Integer, String>();
		
		map.put(secondKey, secondValue);
		map.put(firstKey, firstValue);
		
		System.out.println(map.toString());
		
		map.put(firstKey, "try to repeat first key");
		
		System.out.println(map.toString());
		
		map.remove(firstKey);
		
		System.out.println(map.toString());
		
		
	}
}
