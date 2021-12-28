package com.interview.preparation;

class Candidate{
	String name;
	int totalRating;
	int totalContest;
	public Candidate(String name , int totalRating , int totalContest) {
		this.name = name;
		this.totalRating = totalRating;
		this.totalContest = totalContest;
	}
}
class Validator {
	public String eligible(String name , int totalRating , int totalContest) throws Exception{
		if(totalRating<1000) {
			throw new CriteriaMismatchException();
		}
		if(totalContest<10) {
			throw new CriteriaMismatchException();
		}
		return  "";
		
	}
	public String sendInvite(String name , int totalRating , int totalContest) throws Exception{
		try {
			eligible(name ,  totalRating ,  totalContest);
			System.out.println("eligible candidate");
			System.out.println("invitation sent");
		}
		catch(CriteriaMismatchException e){
			System.out.println("candidate is not eligible");
			e.printStackTrace();

		}
		catch(Exception e){
			System.out.println("other exception");
			e.printStackTrace();

		}
		return "";
		
	}
	
		
	

@SuppressWarnings("serial")
class CriteriaMismatchException extends Exception{
	public  String CriteriaMismatchException(String name , int totalRating , int totalContest) {
		if(totalRating <1000 ) {
			return "minimun 1000total rating is required.";
		}
		if(totalContest <10) {
			return "minimun 10 contest paticipation is required.";
		}
		
		
		return  "";
		
	}
}
public static   class Source2 extends Validator{
	public static void main(String[] args) throws Exception  {
		new Candidate("Rubi", 1111, 13);
		Validator check = new Validator();
		System.out.println(check.eligible("rubi", 2220, 220));
		
		}
	}

}
