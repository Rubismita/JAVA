package String;

import java.util.Scanner;

public class CountAlphabetNumberSpaceSpecialcharacterInString {

	public static void main(String[] args) {
		String str;
		int Alphabet =0 ,number=0,space=0,specialcharacter=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		str = sc.next();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z') {
				Alphabet++;
			}
			else if(ch>='0' && ch<='9') {
				number++;
			}
			else if(ch ==' ') {
				space++;
			}
			else {
				specialcharacter++;
			}
		}
		System.out.println("Total Numner of Alphabet in the given String is ::" +Alphabet);
		System.out.println("Total count of Numbers in the given String  is ::" +number);
		System.out.println("Total Number of Spaces in the  given String is ::" +space);
		System.out.println("Total Number of SpecialCharacters in the  given String is ::" +specialcharacter);

	}

}
