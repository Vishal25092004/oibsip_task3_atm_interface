import java.util.Scanner;

public class ATMInterface {
    private static double balance = 1000; // Initial balance of the account

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM Interface!");
        System.out.println("Your current balance is: $" + balance);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM Interface. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }

    private static void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Deposit amount must be greater than zero.");
        } else {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
            System.out.println("Your new balance is: $" + balance);
        }
    }

    private static void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
            System.out.println("Your new balance is: $" + balance);
        }
    }
}
