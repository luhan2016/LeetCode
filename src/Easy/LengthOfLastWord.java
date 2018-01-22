package Easy;

public class LengthOfLastWord {
	public static int lengthOfLastWord(String s) {
		return s.trim().length()-s.trim().lastIndexOf(" ")-1;
	}
	public static void main(String args[]) {
		String s = new String();
		s = "Hello Worl ";
		System.out.println(lengthOfLastWord(s));
	}
}
