package week2.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of  java sessions in java week1";
        String[] arr = text.split(" ");
        int length = arr.length;
        for (int i = 0; i <= length - 1; i++) {
            
            int count = 0;
            
            for (int j = i+1; j <= length - 1; j++) {
                
                if (arr [i].equalsIgnoreCase(arr[j]) ) {
                    count++;
                }
                
                if (count>1) {
                    arr[i].replaceAll("[\\D]", "");
                    System.out.println(arr[i]);
                }
            }
        }
    }


	}


