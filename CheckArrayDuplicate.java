import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TO CHECK IF AN ARRAY CONTAINS DUPLICATE
public class CheckArrayDuplicate {

	public static void main(String[] args) {
		String duplicates[] = {"java", "jsp", "java", "servlet"};
		List li = Arrays.asList(duplicates);
		Set<String> set = new HashSet<String>(li);
		if(set.size()!=li.size()){
			System.out.println("Contains dups");
		}else {
			System.out.println("No dups");
		}
	}
}
