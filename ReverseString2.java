package week2.day2;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String test = "feeling good";
		   System.out.println("feeling good");
		  String string=input.nextLine();
		   char[]ch = string.toCharArray();
		   System.out.println("Reversed String is:");
		   for(int i =ch.length-1; i>=0; i--)
			   System.out.println(ch[i]);
	}
}
			   
