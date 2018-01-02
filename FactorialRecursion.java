import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		fact = factorial(n);
		System.out.println(fact);
	}

	public static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

}
