import java.util.Scanner;

public class Personal {
    String name;
    String education;
    int age;
    int basic;
    int hra;
    int da;
    int yoe;
    int no_of_loans;
    double[] loan_amt;

    Personal(String name, String education, int age, int basic, int hra, int da, int yoe, int no_of_loans, double[] loan_amt)
    {
        this.name = name;
        this.age = age;
        this.education = education;
        this.basic = basic;
        this.hra = hra;
        this.da = da;
        this.yoe = yoe;
        this.no_of_loans = no_of_loans;
        this.loan_amt = loan_amt;
    }
    void isEligible(Personal p)
    {
        if (p.basic+p.hra+p.da >= 600000 && p.no_of_loans <=2)
        {
            System.out.println("Eligible for loan");
        }
        else {
            System.out.println("Not eligible for loan");
        }
    }

    void taxpay(Personal p)
    {
        int tax;
        if (p.basic >300000)
        {
            tax = 0;
        }
        else if(p.basic >500000){
            tax = (int) (0.1*(p.basic));
        }
        else {
            tax = (int) (0.3 * p.basic);
        }
        System.out.println("tax = "+tax);;
    }

    void isEligiblePromotion(Personal p)
    {
        if (p.yoe>=3 && p.no_of_loans == 0)
        {
            System.out.println("Eligible for promotion");
        }
        else {
            System.out.println("Not eligible for promotion");
        }
    }

    void display(Personal p)
    {
        System.out.println("name: "+p.name);
        System.out.println("age: "+p.age);
        System.out.println("education: "+p.education);
        int salary = p.basic + p.hra + p.da;
        System.out.println("salary: "+salary);
        System.out.println("years of experience: "+p.yoe);
        System.out.println("no of loans: "+p.no_of_loans);
        int sum=0;
        for (int i=0; i<p.loan_amt.length; i++)
        {
            sum+=p.loan_amt[i];
        }
        System.out.println("loan amount: "+ sum);
        System.out.println("name: "+p.name);
        p.isEligible(p);
        p.isEligiblePromotion(p);
        p.taxpay(p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of employees whose details are to be entered");
        n = sc.nextInt();
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter the name");
//            System.out.println();
            String name = sc.next();
            System.out.println("Enter the age");
            int age = sc.nextInt();
            System.out.println("Enter the education");
            String education = sc.next();
            System.out.println("Enter the basic");
            int basic = sc.nextInt();
            System.out.println("Enter the hra");
            int hra = sc.nextInt();
            System.out.println("Enter the da");
            int da = sc.nextInt();
            System.out.println("Enter the years of experience");
            int yoe = sc.nextInt();
            System.out.println("Enter the no. of loans");
            int no_of_loans = sc.nextInt();
            double[] loan_amt = new double[no_of_loans];

            System.out.println("Enter the loan amount");
            for (int j=0; j<no_of_loans; j++)
            {
                loan_amt[j] = sc.nextDouble();
            }

            Personal p1 = new Personal(name, education, age, basic, hra, da,yoe, no_of_loans, loan_amt);
            p1.display(p1);


        }
    }

}
