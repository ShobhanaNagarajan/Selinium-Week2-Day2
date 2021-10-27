package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Testleaf today";
		//split()
		String[] split = str.split(" e  ");
		for(int i = 0; i< split.length; i++) {
			System.out.println("split["+i+"]: "+ split[i]);
			}
		
		String substring = str.substring(13);
		System.out.println(substring);
		
		String substring2 = str.substring(11,18);
		System.out.println(substring2);
		
		String replace= str.replace('e', 'E');
		System.out.println("Replaced str:"+ replace);
		
		String replaceAll = str.replaceAll("[\\d]","");
		System.out.println("replaceAll:"+ replaceAll);
		
		String replaceAll2 = str.replaceAll("[\\D]","");
		System.out.println("replaceAll:"+ replaceAll2);
				
				
				
				
		
		
		

	}

}
