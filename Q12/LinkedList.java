import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        int n, pos;
        String ele;
        Scanner sc = new Scanner(System.in);
        LinkedList<String> L = new LinkedList<String>();

        System.out.println("Enter 1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Display elements with length < 5");
        System.out.println("4. Display all elements");

        while (true) {
            System.out.print("->\t");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter string to enqueue");
                    ele = sc.next();
                    L.add(ele);
                    break;
                case 2:
                    if (L.peek() == null) {
                        System.out.println("List empty");
                    } else {
                        System.out.println("Enter the index to delete element");
                        pos = sc.nextInt();
                        System.out.println("Element deleted = " + L.remove(pos));
                    }
                    break;
                case 3:
                    if (L.peek() == null) {
                        System.out.println("List empty");
                    } else {
                        String e;
                        Iterator<String> itr = L.iterator();
                        while (itr.hasNext()) {
                            e = itr.next();
                            if (e.length() < 5) {
                                System.out.println(e);
                            }
                        }
                    }
                    break;
                case 4:
                    if (L.peek() == null) {
                        System.out.println("Queue empty");
                    } else {
                        Iterator<String> itr = L.iterator();
                        while (itr.hasNext()) {
                            System.out.println(itr.next());
                        }
                    }

                default:
                    break;
            }
        }

    }
}
