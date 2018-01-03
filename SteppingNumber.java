import java.util.Scanner;

public class SteppingNumber {

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		n1 = sc.nextInt();
		System.out.println("enter second number: ");
		n2 = sc.nextInt();
		displayNums(n1, n2);
	}

	public static void displayNums(int n1, int n2) {
		// TODO Auto-generated method stub
		for (int i = n1; i <= n2; i++) {
			if (isStepping(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isStepping(int n) {
		int prev = n % 10;
		n = n / 10;
		while (n > 0) {
			int current = n % 10;
			if (Math.abs(current - prev) != 1) {
				return false;
			}
			prev = current;
			n = n / 10;
		}
		return true;
	}

}
