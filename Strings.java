import java.util.*;

class strpgm {
    Scanner sc = new Scanner(System.in);

    String input() {
        System.out.println("Enter a string");
        String s = sc.nextLine();
        return s;
    }

    String extract(String s, int m, int n) {
        return s.substring(n, n + m);
    }

    int countocc(String s, String r) {
        String c[] = s.split(" ");
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (r.equals(c[i])) {
                count++;
            }
        }
        return count;
    }

    String replaceword(String s, String m, String n) {
        return s.replaceAll(m, n);
    }

    String sortstr(String s) {
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    boolean compare(String s, String r) {
        return s.equalsIgnoreCase(r);
    }

    String concat2(String s, String r) {
        String c = s.concat(r);
        return c;
    }

    public static void main(String[] args) {
        strpgm p = new strpgm();
        String s, a, b;
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println(
                "Enter 1. Extract substring\n2. Count occurances of a word\n3. Repalce a word\n4. Sort a string\n5. Compare two strings\n6. Concatenate two strings");
        op = sc.nextInt();
        switch (op) {
            case 1:
                s = p.input();
                System.out.println("Enter the values of m & n");
                int m = sc.nextInt();
                int n = sc.nextInt();
                System.out.println(p.extract(s, m, n));
                break;
            case 2:
                s = p.input();
                a = p.input();
                System.out.println(p.countocc(s, a));
                break;
            case 3:
                s = p.input();
                System.out.println("Enter words to be replaced");
                a = p.input();
                b = p.input();
                System.out.println(p.replaceword(s, a, b));
                break;
            case 4:
                s = p.input();
                System.out.println(p.sortstr(s));
                break;
            case 5:
                s = p.input();
                a = p.input();
                System.out.println(p.compare(s, a));
                break;
            case 6:
                s = p.input();
                a = p.input();
                System.out.println(p.concat2(s, a));
                break;

            default:
                break;
        }
    }

}
