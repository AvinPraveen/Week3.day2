package Week3.day2.String;

public class Palindrome {

	public static void main(String[] args) {
		//String test="madam";
		String test="Madam";
		String rev="";
	     
		int len = test.length();
		
		for (int i = len-1; i >=0; i--) {
			rev+=test.charAt(i);
			System.out.println(rev);
		}
			//if(test.equals(rev))
			if(test.equalsIgnoreCase(rev))
			{System.out.println("The given string is palindrome");}
			else {System.out.println("The give String is not palindrome"+test);}
		

	}

}
