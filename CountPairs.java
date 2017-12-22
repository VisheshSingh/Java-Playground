
public class CountPairs {

	public static void main(String[] args) {
		int arr[] = {10,5,7,2,6,8};
		int diff = 5;
		int size = arr.length;
		System.out.println("There are "+ count_pairs(arr, diff, size) + " pairs whose diff is " + diff);
	}
	
	public static int count_pairs(int arr[], int diff, int size) {
		int count = 0;
		for(int i=0;i<size-1;i++) {
			for(int j=1;j<size-1;j++) {
				if((arr[i]-arr[j]) == diff) {
					count++;
				}
			}
		}
		return count;
	}

}
