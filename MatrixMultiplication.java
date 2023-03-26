import java.util.Scanner;

public class Matrix {
    int r, c;
    int m[][];
    Scanner sc = new Scanner(System.in);

    Matrix(int r, int c) {
        this.r = r;
        this.c = c;
        m = new int[r][c];
    }

    void getMatrix(int n) {
        System.out.println("Enter the elements of matrix " + n);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("->\t");
                m[i][j] = sc.nextInt();
            }
        }
    }

    int[][] multiply(Matrix m2) {
        int mul[][] = new int[this.r][m2.c];
        for (int i = 0; i < this.r; i++) {
            for (int j = 0; j < m2.c; j++) {
                mul[i][j] = 0;
                for (int k = 0; k < this.c; k++) {
                    mul[i][j] += this.m[i][k] * m2.m[k][j];
                }
            }

        }
        return mul;
    }

    void putMatrix() {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;

        System.out.println("Enter number of rows and columns of matrix 1");
        r = sc.nextInt();
        c = sc.nextInt();
        Matrix m1 = new Matrix(r, c);

        System.out.println("Enter number of rows and columns of matrix 2");
        r = sc.nextInt();
        c = sc.nextInt();
        Matrix m2 = new Matrix(r, c);

        if (m1.c == m2.r) {
            m1.getMatrix(1);
            m2.getMatrix(2);
            System.out.println("Matrix 1 is");
            m1.putMatrix();
            System.out.println("Matrix 2 is");
            m2.putMatrix();
            Matrix m3 = new Matrix(m1.r, m2.c);
            m3.m = m1.multiply(m2);
            System.out.println("The product matrix is");
            m3.putMatrix();
        } else {
            System.out.println("Matrix multiplication not possible");
        }
    }
}
