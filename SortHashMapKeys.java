import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMapKeys {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("apple", "apple");
		map.put("banana", "banana");
		map.put("mango", "mango");
		map.put("pineaaple", "pineapple");
		System.out.println("Unssorted HashMap Keys:");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key value = "+ entry.getKey());
		}
		
		Map<String, String> tree = new TreeMap<String, String>(map);
		System.out.println("Sorted HashMap Keys:");
		for(Map.Entry<String, String> entry : tree.entrySet()) {
			System.out.println("Key value = "+ entry.getKey());
		}
	}
}
