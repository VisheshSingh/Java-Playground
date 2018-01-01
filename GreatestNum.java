import java.util.Scanner;

public class GreatestNum {
	public static int greatest(int limit) {
		int max = 0, i = 1, n;
		System.out.printf("Enter %d numbers", limit);
		while(i <= limit) {
			Scanner sc = new Scanner(System.in);
			System.out.println("your num please: ");
			n = sc.nextInt();
			if(n > max) {
				max = n;
			}
			i++;
		}
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The greatest among the numbers is " + greatest(4)); 
	}

}
