import java.util.Scanner;

public class PerfectNumber {
	public static int sum_of_div(int num) {
		int d_sum = 1;
		for(int i = 2; i <= num/2; i++) {
			if(num%i == 0) {
				d_sum +=i;
			}
		}
		return d_sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(sum_of_div(n) == n) {
			System.out.println("Perfect");
		} else if(n < sum_of_div(n)) {
			System.out.println("Abundant");
		} else {
			System.out.println("Deficient");
		}
	}

}
