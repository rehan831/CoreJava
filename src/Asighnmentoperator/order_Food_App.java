package Asighnmentoperator;

import java.util.*;

public class order_Food_App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] dishes = {"chicken fry", "chicken tikka", "masala dosa", "masala yakhni", "pulaava"};
        double[] price = {120, 450, 120, 580, 150};

        // Show menu
        System.out.println("=== Food Menu ===");
        for (int i = 0; i < dishes.length; i++) {
            System.out.printf("%d. %s - ₹%.2f\n", (i + 1), dishes[i], price[i]);
        }

        // Choose dish
        System.out.print("\nEnter dish number: ");
        int dishChoice = sc.nextInt();
        if (dishChoice < 1 || dishChoice > dishes.length) {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        // Quantity
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        // Cost calculation
        double subtotal = price[dishChoice - 1] * qty;
        double tax = subtotal * 0.18; // 5% tax
        double total = subtotal + tax;

        System.out.printf("\nYou ordered: %s x%d\n", dishes[dishChoice - 1], qty);
        System.out.printf("Subtotal: ₹%.2f\n", subtotal);
        System.out.printf("Tax (18%%): ₹%.2f\n", tax);
        System.out.printf("Total amount: ₹%.2f\n", total);

        // Payment
        sc.nextLine(); // clear buffer
        System.out.println("\nChoose payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Card");
        System.out.print("Enter choice: ");
        int payChoice = sc.nextInt();
        sc.nextLine();
        boolean paymentSuccess = false;
        if (payChoice == 1) {
            System.out.print("Enter UPI ID: ");
            String upi = sc.nextLine();
            paymentSuccess = true; // simulate success
        } else if (payChoice == 2) {
            System.out.print("Enter Card Number: ");
            String card = sc.nextLine();
            paymentSuccess = true; // simulate success
        } else {
            System.out.println("Invalid payment method!");
        }

        if (paymentSuccess) {
            System.out.println("\n✅ Payment successful! Your order is confirmed.");
        } else {
            System.out.println("\n❌ Payment failed.");
        }

        sc.close();
    }
}
