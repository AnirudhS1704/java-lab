import java.util.Scanner;
public class complex {
   static Scanner sc = new Scanner(System.in);
    double real;
    double imag;

    public complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public static void main(String[] args) {
         double a,b,c,d;
        System.out.println("Enter the real and imaginary part of first complex number");
        a = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter the real and imaginary part of second complex number");
        c = sc.nextDouble();
        d = sc.nextDouble();

        complex n1 = new complex(a, b),
                n2 = new complex(c, d),
                temp1,
                temp2,
                temp3;
                

        temp1 = n1.add(n1, n2);
        temp2 = n1.subtract(n1, n2);
        temp3 = n1.multiply(n1, n2);

        System.out.println("Sum: "+temp1.real+"+"+"i"+temp1.imag);
        System.out.println("Difference: "+temp2.real+"+"+"i"+temp2.imag);
        System.out.println("Product: "+temp3.real+"+"+"i"+temp3.imag);
    }

    public complex add(complex n1, complex n2)
    {
        complex temp = new complex(0.0, 0.0);
        temp.real = n1.real + n2.real;
        temp.imag = n1.imag + n2.imag;
        
        return(temp);
    }
    public complex subtract(complex n1, complex n2)
    {
        complex temp = new complex(0.0, 0.0);
        temp.real = n1.real - n2.real;
        temp.imag = n1.imag - n2.imag;

        return(temp);
    }
    public complex multiply(complex n1, complex n2)
    {
        complex temp = new complex(0.0, 0.0);
        temp.real = n1.real * n2.real - n1.imag * n2.imag;
        temp.imag = n1.real + n2.imag - n1.imag * n2.real;

        return(temp);
    }
}
