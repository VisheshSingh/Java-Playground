//TO CHECK IF THE GIVEN STRINGS ARE ANAGRAMS
public class anagrams {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "avaj";
		System.out.println(anag(str1, str2));
	}
	
	public static boolean anag(String s1, String s2) {
		char[] ch = s1.toCharArray();
		StringBuffer sf = new StringBuffer(s2);
		for(char c : ch) {
			int index = sf.indexOf(String.valueOf(c));
			if(index!=-1) {
				sf.deleteCharAt(index);
			}else {
				return false;
			}
		}
		return sf.length()==0;
	}

}
