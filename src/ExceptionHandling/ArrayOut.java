package ExceptionHandling;
import java.util.Scanner;
public class ArrayOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = {10,20,30,20,10};

Scanner sc = new Scanner(System.in);

try {
	System.out.println("enter index");
	int index = sc.nextInt();
	
	System.out.println("value at index"+ index +" = " + arr[index]);
	
}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("you guys have to only put 0 to 4 index number");
}
catch(java.util.InputMismatchException e)
{
	System.out.println("sirf number dalo");	
}
	}

}
