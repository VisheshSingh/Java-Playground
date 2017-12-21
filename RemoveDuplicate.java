import java.util.HashSet;
import java.util.Set;

//TO REMOVE DUPLICATE FROM A STRING
public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "amania";
		System.out.println("After removing the duplicate character: "+ remDup(str));

	}
	
	public static String remDup(String str) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sf = new StringBuffer();
	
		for(int i = 0; i<str.length(); i++) {
			Character ch = str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				sf.append(ch);
			}
		}
		return sf.toString();
	}

}
