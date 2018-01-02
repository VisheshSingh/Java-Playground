
public class BinarySearch {
	public static int binSearch(int arr[], int key) {
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid])
				return mid;
			if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 20, 50, 70, 80, 90, 100 };
		System.out.println("The element is found at index: " + binSearch(arr, 80));
	}

}
