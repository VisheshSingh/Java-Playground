
public class CountVowels {

	public static void main(String[] args) {
		String str = "aeiou";
		System.out.println(countVowel(str));

	}

	public static int countVowel(String str) {
		int count = 0;
		String vowels = "AEIOU";
		str = str.toUpperCase();
		int i = 0;
		while (i < vowels.length()) {
			count += countChar(str, vowels.charAt(i));
			i++;
		}
		return count;
	}

	public static int countChar(String str, char ch) {
		int count = 0;
		while (str.indexOf(ch) >= 0) {
			count++;
			str = str.substring(str.indexOf(ch) + 1);
		}
		return count++;
	}

}
