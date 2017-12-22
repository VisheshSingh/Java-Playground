import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Sum of all factors of " + n + " are: " + sumFactors(n));
	}
	
//	public static int sumFact(int n) {
//		int fSum = 0;
//		for(int i = 1; i <= n; i++) {
//			if(n%i==0) {
//				fSum+=i;
//			}
//		}
//		return fSum;
//	}
	
	public static int sumFactors(int n) {
		int fSum = 1 + n;
		int num = 2;
		while(num<=n/2) {
			if(n%num==0) {
				fSum+=num;
			}
			num++;
		}
		return fSum;
	}

}
