package Week3.day2.String;

public class FindInsection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		
		int length = array1.length;
		int length2 = array2.length;
		
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length2; j++) {
				if(array1[i]==array2[i])
				{
					System.out.println("the matching array is "+array1[i]);
				}
				
			}
			
		}
		
	}

}
