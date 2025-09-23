package ExceptionHandling;


public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int a =10;
	int b = 2;
	int result = a/b;
	System.out.println("result:"+ result);
	
}
catch(ArithmeticException  e){
	
	System.out.println("error cannot divide by zero");
	
}
finally {
	System.out.println("program finished");
}
	}

}
