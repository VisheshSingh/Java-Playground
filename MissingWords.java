import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingWords {

	public static String[] missing(String s, String t) {

		String newS[] = s.split(" ");
		String newT[] = t.split(" ");
		List<String> li = new ArrayList<String>();
		// Iterate through the loop
		// Hey
		for (int i = 0, j = 0; i < newS.length;) {

			if (j >= newT.length) {
				li.add(newS[i]);
				i++;
				j++;
			} else if (newS[i].equals(newT[j])) {
				i++;
				j++;

			} else {
				li.add(newS[i]);
				i++;
			}

		}
		// System.out.println(li);
		return (String[]) li.toArray(new String[li.size()]);
	}

	public static void main(String[] args) {
		String s = "I am using hackerrank to improve programming";
		String t = "";
		System.out.println(Arrays.toString(missing(s, t)));
	}
}