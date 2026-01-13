package GITPracticeProject;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Mrudula";
		int len =str.length();
		for(int i=len; i>0; i--) {
			System.out.print(str.charAt(i-1));
		}

	}

}
