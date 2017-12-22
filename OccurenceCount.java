
public class OccurenceCount {

	public static void main(String[] args) {
		String str = "HelloWorld";
		char ch = 'o';
		System.out.println(counter(str, ch)); 
	}
	
	public static int counter(String str, char ch) {
		int count=0, index=0;
		while(index<str.length()) {
			if(str.charAt(index) == ch) {
				count++;
			}
			index++;
		}
		return count;
	}

}
