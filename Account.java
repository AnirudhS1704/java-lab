import java.util.*;

class Account {
    int AccNo, phone;
    String name;
    float balance;

    Scanner sc = new Scanner(System.in);

    public void getInput() {
        System.out.println("Enter account no.");
        AccNo = sc.nextInt();
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter phone");
        phone = sc.nextInt();
        System.out.println("Enter balance");
        balance = sc.nextInt();
    }

    float deposit() {
        System.out.println("Enter amount to deposit");
        int amt = sc.nextInt();
        balance = balance + amt;
        return balance;
    }

    float withdraw() {
        System.out.println("Enter amount to withdraw");
        float amt = sc.nextInt();
        if (balance - amt <= 0) {
            System.out.println("Insufficient balance");
            return balance;
        } else {
            return balance - amt;
        }
    }

    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account number: " + AccNo);
        System.out.println("Phone: " + phone);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        Account account = new Account();

        System.out.println("Enter 1. Enter details");
        System.out.println("1. Deposit");
        System.out.println("1. Withdraw");
        System.out.println("1. Print details");
        while (true) {
            System.out.print("->\t");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    account.getInput();
                    break;
                case 2:
                    account.balance = account.deposit();
                    break;
                case 3:
                    account.balance = account.withdraw();
                    break;
                case 4:
                    account.printDetails();
                    break;

                default:
                    break;
            }
        }

    }

}
