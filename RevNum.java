import java.util.Scanner;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		int rev = 0, temp = 0;
		while (number > 0) {
			temp = number % 10;
			rev = rev * 10 + temp;
			number = number / 10;
		}
		System.out.println(rev);

	}

}
