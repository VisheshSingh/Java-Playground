import java.util.Scanner;
// TO REVERSE A STRING
public class ReverseString {
	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		String rev = "";
		for(int i = original.length()-1; i >= 0; i-- ){
			rev = rev + original.charAt(i);
		}
		System.out.println(rev);
	}
}

