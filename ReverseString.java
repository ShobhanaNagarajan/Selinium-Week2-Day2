package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		String test = "feeling good";
		String rev="";
		String a[] = test.split("");
		
		
		
		for(int i=0; i<a.length;i++)
	{
			//System.out.println(a[i] + " ");
		}

		for(int i=a.length-1; i>=0; i--)
		{
			rev = rev+a[i]+"";
		}
		System.out.println(rev);
	}

}

