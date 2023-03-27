import java.util.Scanner;

abstract class Vehicle {
    int year_of_manf;
    Vehicle(int year)
    {
        year_of_manf=year;
    }
    abstract void getData();
    abstract void putdata();
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year of manufacture of four wheeler");
        int year = sc.nextInt();
        FourWheeler fourWheeler = new FourWheeler(year);

        System.out.println("Enter year of manufacture of two wheeler");
        year = sc.nextInt();
        TwoWheeler twoWheeler = new TwoWheeler(year);

        fourWheeler.getData();
        fourWheeler.putdata();

        twoWheeler.getData();
        twoWheeler.putdata();

        System.out.println("Enter the year of manufacture, gear type, mileage");
        year = sc.nextInt();
        String gear = sc.next();
        int mileage = sc.nextInt();
        MyTwoWheeler myTwoWheeler = new MyTwoWheeler(year, gear, mileage);
    }
}

class TwoWheeler extends Vehicle{
    Scanner sc = new Scanner(System.in);
    int mileage, cc;
    String name, company;
    TwoWheeler(int year)
    {
        super(year);
    }

    void getData() {
        System.out.println("Enter two wheeler details");
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter company");
        company = sc.next();
        System.out.println("Enter mileage");
        mileage = sc.nextInt();
        System.out.println("Enter cc");
        cc = sc.nextInt();
    }

    @Override
    void putdata() {
        System.out.println("Printing two wheeler details....");
        System.out.println("name: "+name);
        System.out.println("company: "+company);
        System.out.println("mileage: "+mileage);
        System.out.println("cc: "+cc);
    }
}

final class FourWheeler extends Vehicle{
    Scanner sc = new Scanner(System.in);
    int mileage, cc;
    String name, company;

    FourWheeler(int year) {
        super(year);
    }

    @Override
    void getData() {
        System.out.println("Enter four wheeler details");
        System.out.println("Enter name");
        name = sc.next();
        System.out.println("Enter company");
        company = sc.next();
        System.out.println("Enter mileage");
        mileage = sc.nextInt();
        System.out.println("Enter cc");
        cc = sc.nextInt();
    }

    @Override
    void putdata() {
        System.out.println("Printing four wheeler details....");
        System.out.println("name: "+name);
        System.out.println("company: "+company);
        System.out.println("mileage: "+mileage);
        System.out.println("cc: "+cc);
    }
}

class  MyTwoWheeler extends TwoWheeler{
    String gearType;
    int mileage;
    MyTwoWheeler(int year, String gearType, int mileage)
    {
        super(year);
        this.gearType = gearType;
        this.mileage = mileage;

        System.out.println("Gear type: "+ gearType);
        System.out.println("mileage: "+ mileage);
    }
}
