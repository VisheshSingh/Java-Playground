
public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 30, 40, 90, 85, 80 };
		System.out.println("The second highest element is: " + secHigh(arr));
	}

	public static int secHigh(int[] arr) {
		int highest = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > highest) {
				sec = highest;
				highest = arr[i];
			} else if (arr[i] > sec) {
				sec = arr[i];
			}
		}
		return sec;
	}

}
