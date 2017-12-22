import java.util.Scanner;

public class LetterCount {

	public static void main(String[] args) {
		System.out.print("Enter your sentence: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count=0,index=0;
		while(index<str.length()) {
			if(str.charAt(index) != ' ') {
				count++;
			}
			index++;
		}
		System.out.println(count);
	}

}
