package Asighnmentoperator;
import java.util.Scanner;
public class withif {
	
	public static void main(String[]args) {
		
		int age = 17;
        

        if (age >= 18) {
            System.out.println("you are eligible: ");
        }
            else {
            	System.out.println("you are not eligible");
            }
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enetre the first numer ");
		int a = sc.nextInt();
		
		System.out.println("enetre the second numer ");
		int b = sc.nextInt();
		
		
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
		
		
	}
	
	}
