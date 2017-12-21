//TO PRINT THE MISSING NUMBER IN AN ARRAY
public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,8};
		System.out.println("Missing number is: " + getMissingNum(arr,8));
		
	}
	
	public static int getMissingNum(int[] arr, int n) {
		int actualsum=0;
		int expectedsum = (n*(n+1))/2;
		for(int i=0;i<arr.length;i++) {
			actualsum=actualsum+arr[i];
		}
		return expectedsum-actualsum;
	}

}
