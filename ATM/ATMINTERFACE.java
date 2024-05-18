import java.util.Scanner;

class BankAccount {
    public double balance;

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit: " + amount);
    }

    public double checkBalance() {
        System.out.println("Your Balance is " + balance);
        return balance;
    }
}

public class ATMINTERFACE {
    private BankAccount ac = new BankAccount();
    Scanner sc = new Scanner(System.in);

    public void choice() {
        while (true) {
            System.out.println("\nWelcome to the ATM. Please choose any one option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.println("\nEnter your choice: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Amount to be deposited: ");
                    double depositAmount = sc.nextDouble();
                    ac.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Amount to be withdrawn: ");
                    double withdrawAmount = sc.nextDouble();
                    ac.withdraw(withdrawAmount);
                    break;
                case 3:
                    ac.checkBalance();
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ATMINTERFACE atmMachine = new ATMINTERFACE();
        atmMachine.choice();
    }
}
