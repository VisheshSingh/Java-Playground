import java.util.Scanner;

//TO CHECK IF A NUMBER IS CIRCLAR PRIME
public class CircularPrime {
	public static boolean isPrime(int n) {
		boolean prime = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime = false;
			}
		}
		if(prime==true) {
			return true;
		} else {
			return false;
		}
	}
	
	public static int circulate(int n) {
		String newnum = Integer.toString(n);
		String p = newnum.substring(1) + newnum.charAt(0);
		int a = Integer.parseInt(p);
		return a;
	}
	
	public static void isCircularPrime(int n) {
		int a = n;
		do {
			//System.out.println(a);
			if(isPrime(n)==false) {
				System.out.println("It is NOT a Circular Prime");
				break;
			}
			a=circulate(a);
		}while(a!=n);
		System.out.println("It IS a Circular Prime");
	}
	
	public static void main(String[] args) {
		System.out.println("Test a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		isCircularPrime(n);

	}
}
