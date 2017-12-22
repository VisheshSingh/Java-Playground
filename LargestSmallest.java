//TO PRINT LARGEST ANS SMALLEST NUMBER IN AN ARRAY
public class LargestSmallest {

	public static void main(String[] args) {
		int[] arr = {10,100,1,54,87};
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i : arr) {
			if(i>largest) {
				largest=i;
			}
		}
		System.out.println("Largest: " + largest);
		
		for(int i : arr) {
			if(i<smallest) {
				smallest=i;
			}
		}
		System.out.println("Smallest: " + smallest);
	}

}
