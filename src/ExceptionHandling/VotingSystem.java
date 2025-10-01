package ExceptionHandling;

public class VotingSystem {
	public static void main(String[]args) {
		
		int age =15;
		try {
		assert age >= 18:"voter age should be 18";
		System.out.println("Voter is allowed to vote.");
		}
		catch(AssertionError e){
			System.out.println(e);
		}
		System.out.println("voter cant to do vote");
	}

}
