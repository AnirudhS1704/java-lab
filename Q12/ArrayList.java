import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Q = new ArrayList<String>();

        int n;
        String ele;

        System.out.println("Enter 1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Peak element");
        System.out.println("4. Display");

        while (true) {
            System.out.print("->\t");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter string to enqueue");
                    ele = sc.next();
                    Q.add(ele);
                    break;
                case 2:
                    if (Q.isEmpty()) {
                        System.out.println("Queue empty");
                    } else {
                        System.out.println("Element dequeued = " + Q.remove(0));
                    }
                    break;
                case 3:
                    if (Q.isEmpty()) {
                        System.out.println("Queue empty");
                    } else {
                        System.out.println("Element at peak = " + Q.get(0));
                    }
                    break;
                case 4:
                    if (Q.isEmpty()) {
                        System.out.println("Queue empty");
                    } else {
                        for (int i = 0; i < Q.size(); i++) {
                            System.out.print(Q.get(i) + "\t");
                        }
                        System.out.println();
                    }

                default:
                    break;
            }
        }
    }
}
