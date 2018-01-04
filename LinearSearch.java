
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 50, 80, 70, 60, 30, 100 };
		System.out.println("The element is found at index: " + LinSearch(arr, 60));
	}

	public static int LinSearch(int[] arr, int key) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

}
