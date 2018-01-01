
public class Swapping {

	public static void main(String[] args) {
		int x = 10, y = 20;
//		METHOD 1
//		x = x + y;
//		y = x - y;
//		x = x - y;
//		METHOD 2
		x = x * y;
		y = x / y;
		x = x / y;
//		METHOD 3
//		x = x ^ y;
//		y = x ^ y;
//		x = x ^ y;
		System.out.println("x = "+ x + " and y = " + y);

	}

}
