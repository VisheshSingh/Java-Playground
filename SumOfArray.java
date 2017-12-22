import java.util.Scanner;

//TO FIND THE SUM OF ELEMENTS IN AN ARRAY
public class SumOfArray {

	public static void main(String[] args) {
		System.out.print("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter your "+ n + " numbers now: ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i : arr) {
			sum = sum + i;
		}
		System.out.println("Sum is: "+ sum);
	}

}
