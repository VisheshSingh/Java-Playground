//CONVERT DECIMAL TO BINARY
public class DecimalToBinary {

	public static void main(String[] args) {
		binary(4);
	}
	
	public static void binary(int n) {
		int[] bin = new int[25];
		int index = 0;
		while(n>0) {
			bin[index++] = n%2;
			n=n/2;
		}
		for(int i=index-1;i>=0;i--) {
			System.out.print(bin[i]);
		}
	}

}
