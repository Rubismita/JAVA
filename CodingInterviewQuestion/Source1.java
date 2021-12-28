package com.interview.preparation;
class Sort{
	static final int ASCII_SIZE = 256 ;
	public char maxOccuringChar(String str) {
		int count[] = new int [ASCII_SIZE];
		int len = str.length();
		for(int i=0;i<len;i++) {
			count[str.charAt(i)]++;
		}
		int max = -1;
		char result = ' ';
		for(int i=0;i<len;i++) {
			if(max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result ;
		
	}
}
public class Source1  extends Sort{
	public static void main(String[] args) {
		Sort s = new Sort();
	System.out.println(s.maxOccuringChar("rubismita satapathy"));
	}

}
