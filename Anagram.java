package Week3.day2.String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stop";
		String text2="potss";
		boolean Status=false;
		/*
		 * int length = text1.length(); int length2 = text2.length();
		 */
		if (text1.length()==text2.length()) {
			char[] ArrayS1  = text1.toCharArray();
			char[] ArrayS2=text2.toCharArray();
			 Arrays.sort(ArrayS1 );
			 Arrays.sort(ArrayS2 );
			  Status = Arrays.equals(ArrayS1, ArrayS2);
		}
		if(Status==true)
		{
			System.out.println("given string is Anagram ");
		}
		else
			System.out.println("given string is not Anagram");
		
	}

}
