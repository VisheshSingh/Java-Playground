import java.util.Scanner;

public class FibRecursion {
	static int n1 = 0, n2 = 1, n3;

	public static void printFib(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
			printFib(count - 1);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int count = sc.nextInt();
		System.out.print(n1 + " " + n2);
		printFib(count - 2);

	}

}
