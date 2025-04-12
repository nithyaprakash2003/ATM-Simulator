import java.util.Scanner;

public class ATM {
    static int balance = 10000; // default balance
    static final int PIN = 1234; // simple 4-digit PIN

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != PIN) {
            System.out.println("Incorrect PIN. Access Denied.");
            return;
        }

        int option;
        do {
            System.out.println("\n---- ATM Menu ----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your balance: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("₹" + deposit + " deposited successfully.");
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    int withdraw = sc.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("₹" + withdraw + " withdrawn successfully.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you! Visit again.");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (option != 4);

        sc.close();
    }
}
