package ExceptionHandling;
import java.util.Scanner;


public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your : Age");
		int age = sc.nextInt();
		try {
			if(age<18) {
				throw new UderAgeException();
			}
			else {
				System.out.println("you are eligible");
			}
		}
		
		catch(UderAgeException e) {
			e.printStackTrace();
		}
		if(age<18) {
			System.out.println("Try after Sometime you are small kids");
		}
		else {
			System.out.println(" your  welcome in our indian election ");
		}
	}

}
class UderAgeException extends RuntimeException{
	
	UderAgeException(){
		super("you can not vote");
		
	}
	UderAgeException(String msg){
		super(msg);
	}
}