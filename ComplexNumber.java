import java.util.Scanner;

public class Complex {
    int real, imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex sum(Complex c1, Complex c2) {
        Complex c3 = new Complex(c1.real + c2.real, c1.imag + c2.imag);
        return c3;
    }

    public Complex difference(Complex c1, Complex c2) {
        Complex c3 = new Complex(c1.real - c2.real, c1.imag - c2.imag);
        return c3;
    }

    public Complex product(Complex c1, Complex c2) {
        Complex c3 = new Complex(c1.real * c2.real - c1.imag * c2.imag, c1.real * c2.imag + c1.imag * c2.real);
        return c3;
    }

    public static void main(String[] args) {
        int a, r1, i1, r2, i2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");

        while (true) {
            System.out.print("->\t");
            a = sc.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Enter real and imaginary part of complex number 1");
                    r1 = sc.nextInt();
                    i1 = sc.nextInt();
                    Complex c1 = new Complex(r1, i1);
                    System.out.println("Enter real and imaginary part of complex number 2");
                    r2 = sc.nextInt();
                    i2 = sc.nextInt();
                    Complex c2 = new Complex(r2, i2);
                    Complex c3 = c1.sum(c1, c2);
                    System.out.println("The sum = " + c3.real + " + i" + c3.imag);
                    break;
                case 2:
                    System.out.println("Enter real and imaginary part of complex number 1");
                    r1 = sc.nextInt();
                    i1 = sc.nextInt();
                    c1 = new Complex(r1, i1);
                    System.out.println("Enter real and imaginary part of complex number 2");
                    r2 = sc.nextInt();
                    i2 = sc.nextInt();
                    c2 = new Complex(r2, i2);
                    c3 = c1.difference(c1, c2);
                    System.out.println("The difference = " + c3.real + " + i" + c3.imag);
                    break;
                case 3:
                    System.out.println("Enter real and imaginary part of complex number 1");
                    r1 = sc.nextInt();
                    i1 = sc.nextInt();
                    c1 = new Complex(r1, i1);
                    System.out.println("Enter real and imaginary part of complex number 2");
                    r2 = sc.nextInt();
                    i2 = sc.nextInt();
                    c2 = new Complex(r2, i2);
                    c3 = c1.product(c1, c2);
                    System.out.println("The product = " + c3.real + " + i" + c3.imag);
                    break;

                default:
                    break;
            }
        }
    }

}
