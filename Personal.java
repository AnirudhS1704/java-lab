import java.util.Scanner;

public class Personal {
    String name, edu;
    int age, basic, hra, da, yoe, noOfLoans, loanAmt;

    Personal(String name, String edu, int age, int basic, int hra, int da, int yoe, int noOfLoans, int loanAmt) {
        this.name = name;
        this.age = age;
        this.edu = edu;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.yoe = yoe;
        this.noOfLoans = noOfLoans;
        this.loanAmt = loanAmt;
    }

    boolean isEligible() {
        if (yoe > 2 && noOfLoans < 2) {
            return true;
        }
        return false;
    }

    double taxPay() {
        double tax;
        if (basic < 10000) {
            tax = 0;
        } else if (basic < 50000) {
            tax = 0.1 * basic;
        } else if (basic < 100000) {
            tax = 0.2 * basic;
        } else {
            tax = 0.3 * basic;
        }
        return tax;
    }

    boolean isEligiblePromotion() {
        if (basic > 20000 && yoe > 4) {
            return true;
        }
        return false;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Education: " + edu);
        int salary = basic + hra + da;
        System.out.println("Salary: " + salary);
        System.out.println("Years of expreience: " + yoe);
        System.out.println("No of loans: " + noOfLoans);
        System.out.println("Total loan amount: " + loanAmt);

        boolean isEligible = isEligible();
        double tax = taxPay();
        boolean isEligiblePromotion = isEligiblePromotion();

        System.out.println("Is eligible for loan: " + isEligible);
        System.out.println("Tax: " + tax);
        System.out.println("Is eligible for promotion: " + isEligiblePromotion);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, edu;
        int age, basic, hra, da, yoe, noOfLoans, loanAmt;
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();
        Personal[] personals = new Personal[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of person " + i);
            System.out.println("Enter name");
            name = sc.next();
            System.out.println("Enter age");
            age = sc.nextInt();
            System.out.println("Enter education");
            edu = sc.next();
            System.out.println("Enter basic");
            basic = sc.nextInt();
            System.out.println("Enter hra");
            hra = sc.nextInt();
            System.out.println("Enter da");
            da = sc.nextInt();
            System.out.println("Enter years of experience");
            yoe = sc.nextInt();
            System.out.println("Enter number of loans");
            noOfLoans = sc.nextInt();
            System.out.println("Enter loan amount");
            loanAmt = sc.nextInt();

            personals[i] = new Personal(name, edu, age, basic, hra, da, yoe, noOfLoans, loanAmt);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Displaying person " + i);
            personals[i].display();
            System.out.println();
        }

    }
}
