// import bank.BankOperations;
import bank.MainBank;
import bank.BankOperations;
import java.util.*;

import javax.swing.text.Style;

public class  testBank{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankOperations bank = new MainBank("mos","1234",1000);

        boolean loggedIn = false;

        System.out.println("Welcome to the Bank Management System!");

        while (true) {
            if (!loggedIn) {
                System.out.print("Enter Username: ");
                String username = scanner.nextLine();
                System.out.print("Enter Password: ");
                String password = scanner.nextLine();
                try{

                    bank.credentialsCheck(username, password);
                    loggedIn=true;
                    // if (!loggedIn) {
                    //     System.out.println("Username or password is incorrect. Try again.");
                        // continue;
                // }
                
                    
                }
                catch(Exception e){

                    System.out.println(e);
                    continue;
                }
                }
            

            System.out.println("Choose an operation:");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Display Balance");
            System.out.println("4. Exit");
             System.out.println("5.log out");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to credit: ");
                    double creditAmount = scanner.nextDouble();
                    bank.credit(creditAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to debit: ");
                    double debitAmount = scanner.nextDouble();
                    try{

                        bank.debit(debitAmount);
                        // if (!debited) {
                        //     System.out.println("Transaction failed due to insufficient balance.");
                        // }
                    }
                    catch(Exception e){
                        System.out.println(e);
                    }
                    break;
                case 3:
                    bank.displayBalance();
                    break;
                case 4:
                    if (bank.exit()) {
                        System.out.println("Exiting Bank Management System. Goodbye!");
                        System.exit(0);
                    }
                    break;
                case 5:
                    loggedIn=false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }
}
