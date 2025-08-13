package Asighnmentoperator;
import java.util.Scanner;
public class if_else_while {
	

	

	    // Function for inserting ATM card
	    static void insertCard() {
	        System.out.println("💳 Card inserted successfully...");
	    }

	    // Function for ejecting ATM card
	    static void ejectCard() {
	        System.out.println("💳 Please take your card. Goodbye!");
	    }

	    // Function for PIN verification
	    static boolean verifyPIN(Scanner sc) {
	        int correctPIN = 1234; // default PIN
	        System.out.print("Enter your 4-digit PIN: ");
	        int pin = sc.nextInt();

	        if (pin == correctPIN) {
	            System.out.println("✅ PIN verified successfully.");
	            return true;
	        } else {
	            System.out.println("❌ Incorrect PIN. Transaction cancelled.");
	            return false;
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double balance = 5000; // initial balance

	        // Step 1: Insert card
	        insertCard();

	        // Step 2: PIN verification
	        if (!verifyPIN(sc)) {
	            ejectCard();
	            sc.close();
	            return;
	        }

	        // Step 3: Show menu in loop until user exits
	        while (true) {
	            System.out.println("\n===== Welcome to ATM =====");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Deposit Money");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Your balance is: ₹" + balance);
	                    break;

	                case 2:
	                    System.out.print("Enter amount to withdraw: ₹");
	                    double withdraw = sc.nextDouble();
	                    if (withdraw <= balance) {
	                        balance -= withdraw;
	                        System.out.println("Please collect your cash.");
	                        System.out.println("Remaining balance: ₹" + balance);
	                    } else {
	                        System.out.println("Insufficient balance ❌");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter amount to deposit: ₹");
	                    double deposit = sc.nextDouble();
	                    balance += deposit;
	                    System.out.println("Money deposited successfully.");
	                    System.out.println("Updated balance: ₹" + balance);
	                    break;

	                case 4:
	                    ejectCard();
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice ❌");
	            }
	        }
	    }
	}


