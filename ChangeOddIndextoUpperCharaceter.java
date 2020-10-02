package Week3.day2.String;

public class ChangeOddIndextoUpperCharaceter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="changeme";
		char[] charArray = test.toCharArray();
		
		int length = charArray.length;
		String upcase="";
		
		for (int i = 0; i < length; i++) {
			
			if(i%2==1)
			{
				upcase=upcase+ Character.toUpperCase(charArray[i]);
				
			}
			else
			{
				upcase+=Character.toLowerCase(charArray[i]);
			}
		}
		System.out.println(upcase);
	}

}
