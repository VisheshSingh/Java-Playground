//import java.util.Scanner;

public class AddNumStrings {
	public static int StringToInteger(String str) {
		int result = 0, factor = 1;
		for (int i = str.length() - 1; i >= 0; i--) {
			result += (str.charAt(i) - '0') * factor;
			System.out.println(result);
			factor *= 10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print("Result:");
		System.out.println(StringToInteger("1234") + StringToInteger("123"));

	}

}
