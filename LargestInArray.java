import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 6, 81, 63, 93, 1, 45, 78, 20 };
		int len = arr.length;
		System.out.println("The largest is:" + largest(arr, len));
	}

	public static int largest(int[] arr, int len) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		return arr[len - 1];
	}

}
