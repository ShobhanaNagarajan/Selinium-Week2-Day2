package week2.day1;

public class CharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;

		String str = "welcome to chennai";

	char[] chArr = str.toCharArray();

		for (int i = 0; i < chArr.length; i++) {
			// i=0 --> chArr[0]='w'
			// i=1 --> chArr[1]='e'

			if(chArr[i]=='e') {
				count = count +1;
			}
		}

		System.out.println(" Count of e:" + count);

	}

}
