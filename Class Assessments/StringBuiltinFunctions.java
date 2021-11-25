package String;

public class StringBuiltinFunctions {

	public static void main(String[] args) {
	  
		String s1="Rubi";
		String s2="smita";
		System.out.println("s1 string length::"+s1.length());
		System.out.println("s2 string length::"+s2.length());
        System.out.println();
       
        String str="Hy";
        String str1="Hello";
		System.out.println(str1.compareTo(str));
		System.out.println();
	
		System.out.println(s1.concat(s2));
		System.out.println();
		
		String s3= "Hy Its Rubismita here";
		System.out.println(s3.toUpperCase());
		System.out.println();
		
		System.out.println(s3.toLowerCase());
		System.out.println();
		
		System.out.println(s1.trim()+"Where are you");
		System.out.println();
		
		
		//System.out.println(s3.replace(I, i));
		System.out.println();
		
		System.out.println(s3.contains("Hy"));
		System.out.println(s3.contains("here"));
		System.out.println(s3.contains("Sachin"));
		System.out.println();
		
		String s4="Rubi";
		String s5="rubi";
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s4.equalsIgnoreCase(s5));
		System.out.println(s1.equals(s4));
		System.out.println();
		
		String s6="";
		System.out.println(s6.isEmpty());
		System.out.println(s5.isEmpty());
		System.out.println();
		
		
		String name="Rubismita";
		String s7=String.valueOf(name);
		System.out.println(s7+" Satapathy");
		
		
		
		
		
		
	}

}
