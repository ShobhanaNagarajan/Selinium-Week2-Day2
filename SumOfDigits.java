package week2.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		String text ="Tes12le79af65";
		int n, r,sum=0 ,add=0 ;
		String numbers = text.replaceAll("[^0-9]","");
		int digit = Integer.parseInt(numbers);
		System.out.println("Digits are in the form of Integer"+digit);
		
	//method1	
		for(int j=0; j < numbers.length();j++) {
			char c=numbers.charAt(j);
			n=Character.getNumericValue(c);
			add= add+n;
				
		}
		System.out.println("Sum of digits:" + add);
		
		
		//method 2
		     while(digit>0)
		     {
		    	 r=digit%10;
		    	 sum=sum+r;
		    	 digit=digit/10;
		     }
		     System.out.println("Sum of Digits:" +sum);
	}
	

}
