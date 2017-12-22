import java.util.Scanner;

//TO CHECK IF A NUMBER IS PRIME OR NOT
public class CheckPrime {

	public static void main(String[] args) {
		boolean prime = true;
		System.out.println("Test a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i=2;i<num;i++) {
			if(num%i==0) {
				prime = false;
			}
		}
		
		if(prime) {
			System.out.println("It's a prime!");
		} else {
			System.out.println("It's a not prime");
		}
	}

}
