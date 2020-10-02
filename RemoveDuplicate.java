package Week3.day2.String;
import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		//List<String> example=Arrays.asList("we learn java basics as part of java sessions in java week1");
		//System.out.println(example);
		int count=0;
		String[] textnew=text.split(" ");
		System.out.println(textnew);
		
		
		List<String> as= Arrays.asList(textnew);
			
		Set<String> newtext=new LinkedHashSet<String>(as);
		
		StringBuilder StringBuilder = new StringBuilder();
		
		for (String string1 : newtext) 
		{
			System.out.println(string1);
			if(count>0) 
				StringBuilder.append(" ");
				StringBuilder.append(string1);
				count++;
		}
			text=StringBuilder.toString();
			System.out.println("String without Duplicates: "+text);
			
			/*
			 * String str="we learn java basics as part of java seesion in java week1";
			 * String[] splitword = str.split(" ");
			 * 
			 * List<String> example=Arrays.asList(splitword); Set<String> exset= new
			 * LinkedHashSet<String>(example); System.out.println(exset);
			 * //System.out.println(splitword); for (String string : exset) { //String[]
			 * split = string.split(""); System.out.print(string);
			 */	}

}
