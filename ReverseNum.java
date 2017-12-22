//TO REVERSE A NUM
public class ReverseNum {

	public static void main(String[] args) {
		int num = 14258;
		String n = String.valueOf(num);
		String rev = "";
		for(int i=n.length()-1;i>=0;i--) {
			rev = rev + n.charAt(i);
		}
		System.out.println(rev);
	}

}
