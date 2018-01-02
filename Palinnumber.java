import java.util.Scanner;

public class Palinnumber {

	public static void main(String[] args) {
		int r, n, rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		int temp = n;
		while (n > 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (temp == rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
