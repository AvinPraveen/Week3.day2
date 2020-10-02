package Week3.day2.String;

public class SumofDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		System.out.println("the given string is : "+text);
		int sum=0;
		int l = text.length();
		for (int i = 0; i < l; i++) 
		{
			if(Character.isDigit(text.charAt(i)))
			{
				String temp=text.substring(i, i+1);
				sum=sum+Integer.parseInt(temp);
			}
		}
		System.out.println("the sum of the digit from string is: "+sum);

	}

}
