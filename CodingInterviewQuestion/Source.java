package com.interview.preparation;

class Credentials{
	String userName;
	String password;
 public	Credentials(String userName , String password){
		this.userName = userName;
		this.password = password;
	}
	
}
class Implementation{
	public String passwordValidator(String userName,String password) throws Exception {
		
		if(!(password.length() >= 8) && (password.length() <= 40)){//length of password must in between 8 to 40
			throw new LengthMismatchException();
		}
		if (true) {
            int count = 0;
  
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
  
                // to convert int to string
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                throw new MissingCharacterException();
            }
        }
			
			if(!(password.contains("@")|| password.contains("#")||//have at least one special character 
					password.contains("!")|| password.contains("~")||
					password.contains("$")|| password.contains("%")||
					password.contains("^")|| password.contains("&")||
					password.contains("*")|| password.contains("(")||
					password.contains(")")|| password.contains("-")||
					password.contains("+")|| password.contains("/")||
					password.contains(":")|| password.contains(".")||
					password.contains(",")|| password.contains("<")||
					password.contains(">")|| password.contains("?")||
					password.contains("|"))) {
				throw new MissingCharacterException();
			}
			if (true) {
	            int count = 0;
	  
	            // checking small letters
	            for (int i = 90; i <= 122; i++) {
	  
	                // type casting
	                char c = (char)i;
	                String str1 = Character.toString(c);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                throw new MissingCharacterException();
	            }
	        }
			if (true) {
	            int count = 0;
	  
	            // checking capital letters
	            for (int i = 65; i <= 90; i++) {
	  
	                // type casting
	                char c = (char)i;
	  
	                String str1 = Character.toString(c);
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                throw new MissingCharacterException();
	            }
	        }
			return password;
		}
	
	public String signup(String userName , String password){
		try {
			passwordValidator(userName, password);
			System.out.println("valid password");
			System.out.println("signup successfully");
		}
		catch(MissingCharacterException e) {
			System.out.println("invalid password");
			e.printStackTrace();
		} 
		catch(LengthMismatchException e) {
			System.out.println("invalid password");
			e.printStackTrace();
		} 
		catch(Exception e) {
			System.out.println("other exception");
			e.printStackTrace();
		} 
		return password;
	}
}
@SuppressWarnings("serial")
class MissingCharacterException extends Exception{
	public String MissingCharacterEcxeption(String password) {
	switch(password) {
	case "A":
		return (" password must contains"  + " at least one digit(0-9");
	case "B"	:
		return (" password must contains"  + " at least one special character");
	case "C"	:
		return (" password must contains"  + " at least one uppercase alphabet(A-Z)");	
	case "D"	:
		return (" password must contains"  + " at least one lowercase alphabet(a-z)");		
	}
	return password;
	
	}
	
}
@SuppressWarnings("serial")
class LengthMismatchException extends Exception{
	public String LengthMismatchException(String password) {
		switch(password) {
		case "A":
			return " length of password is not between 8 to 40";
		}
		return password;
		
	}
	
}
public class Source extends Implementation {

	public static void main(String[] args) throws Exception {
		Implementation obj = new Implementation();
		obj.passwordValidator("rubi","Rubismita#20");
		obj.signup("To","680gjAtyuk#");
		
		
	}

}
