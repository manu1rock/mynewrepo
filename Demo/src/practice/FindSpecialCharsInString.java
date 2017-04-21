package practice;

import java.util.regex.Pattern;

public class FindSpecialCharsInString {
	
	static boolean containsNonAlphanumeric(String str){
		return Pattern.compile("[^\\w\\s]").matcher(str).find();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am @ABC @#$. Where are *&";
		boolean abc = containsNonAlphanumeric(str);
		System.out.println(abc);
	}

}
