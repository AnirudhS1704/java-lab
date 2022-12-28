package Q10;
import java.util.Scanner;
import Q10.ISE.ISE_Department;
// import Q10.Faculty;


public class MainClass {
   
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        ISE_Department ise_Department = new ISE_Department();
        Faculty f = new Faculty();
        System.out.println("Enter the number of faculty whose details are to be entered");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) 
            {ise_Department.readData(f);
        
            if (f.yoe >= 20) {
                ise_Department.printData(f);
                ise_Department.no_research_consltncy_projs(f);
                ise_Department.no_research_consltncy_projs(f);
            }
        }
        
        

    }
}
