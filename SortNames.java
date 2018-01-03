import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		String names[] = new String[n];
		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextLine();
		}
		ArrayList<String> sortedNames = sortNames(names);
		for (String s : sortedNames) {
			System.out.println(s);
		}
	}

	public static ArrayList<String> sortNames(String[] names) {
		ArrayList<String> all_names = new ArrayList<String>();
		for (String name : names) {
			all_names.add(name);
		}
		Collections.sort(all_names);
		Collections.reverse(all_names);
		return all_names;
	}

}
