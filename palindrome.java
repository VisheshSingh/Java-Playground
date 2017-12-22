import java.util.Scanner;

//TO CHECK IF THE STRING IS PALINDROME
public class palindrome {

	public static void main(String[] args) {
		System.out.print("Enter the string: ");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		String rev = "";
		for(int i = original.length()-1; i >= 0; i-- ){
			rev = rev + original.charAt(i);
		}
		if(original.equals(rev)) {
			System.out.println("Given string is palindrome");
		}else {
			System.out.println("Given string is NOT a palindrome");
		}
	}

}
