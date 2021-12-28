package Maven_Pratical.DoSecectQuestions;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;


//finf the uniqeue vowel and consonant
class Alphabet{
	public int uniqueVowel(String str) {
		int a=0,e=0,i=0,o=0,u=0;
		for(char ch:str.toLowerCase().toCharArray())
		{
			if(ch=='a') {
				a=1;
			}
			else if( ch=='e') {
				e=1;
			}
			else if( ch=='i') {
				i=1;
			}
			else if( ch=='o') {
				o=1;
			}
			else if( ch=='u' ){
				u=1;
			}
		}
	return a+e+i+o+u;
	}
	public int uniqueConsonant(String str) {
		int b=0,c=0,d=0,f=0,g=0,h=0,j=0,k=0,l=0,m=0,n=0,p=0,q=0,r=0,s=0,t=0,v=0,w=0,x=0,y=0,z=0;
		for(char ch:str.toLowerCase().toCharArray())
		{
			if(ch=='b') {
				b=1;
			}
			else if( ch=='c') {
				c=1;
			}
			else if( ch=='d') {
				d=1;
			}
			else if( ch=='f'	){	
				f=1;
			}
			else if( ch=='g' ){
				g=1;
			}
			if(ch=='h') {
				h=1;
			}
			else if( ch=='j') {
				j=1;
			}
			else if( ch=='k') {
				k=1;
			}
			else if( ch=='l'	){	
				l=1;
			}
			else if( ch=='m' ){
				m=1;
			}
			if(ch=='n') {
				n=1;
			}
			else if( ch=='p') {
				p=1;
			}
			else if( ch=='q') {
				q=1;
			}
			else if( ch=='r'	){	
				r=1;
			}
			else if( ch=='s' ){
				s=1;
			}
			if(ch=='t') {
				t=1;
			}
			else if( ch=='v') {
				v=1;
			}
			else if( ch=='w') {
				w=1;
			}
			else if( ch=='x'	){	
				x=1;
			}
			else if( ch=='y' ){
				y=1;
			}
			else if( ch=='z' ){
				z=1;
			}
		}
	return b+c+d+f+g+h+j+k+l+m+n+p+q+r+s+t+v+w+x+y+z;
	}
}

public class Source extends Alphabet {

	public static void main(String[] args) {
		Source sc = new Source();
        System.out.println(sc.uniqueVowel("ahgjbhk"));
       System.out.println( sc.uniqueConsonant("fhmayygnnnmm"));
	}

}
