import java.util.Scanner;

public class Stack {
    int size, top;
    int arr[];

    Stack(int size) {
        this.size = size;
        top = -1;
        arr = new int[size];
    }

    public void push(int ele) {
        if (top == size - 1) {
            System.out.println("Stack overflow!");
            return;
        }
        arr[++top] = ele;
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack underflow!");
            return -10000;
        }
        return arr[top--];
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        int n = sc.nextInt();
        Stack stack = new Stack(n);

        System.out.println("Enter 1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        while (true) {
            System.out.print("->\t");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.println("Enter the element to push");
                    int ele = sc.nextInt();
                    stack.push(ele);
                    break;
                case 2:

                    System.out.println("Element popped = " + stack.pop());
                    break;
                case 3:
                    stack.display();
                    break;

                default:
                    break;
            }
        }
    }
}
