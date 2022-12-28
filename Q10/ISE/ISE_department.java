package Q10.ISE;
import java.util.Scanner;
import Q10.Department;
import Q10.Faculty;

class MyException extends Exception
{
    MyException(String s)
    {
        super(s);
    }
}

public class ISE_Department implements Department{
    Scanner sc = new Scanner(System.in);
    
    
    public void readData(Faculty f) {
        try{
            System.out.println("Enter the 1. name\n2. designation\n3. joining date\n4. subjects handled\n5. age\n6. years of experience\n7. number of research consultancy projects\n8. number of designations");
        f.name = sc.next();
        f.designation = sc.next();
        f.joining_date = sc.next();
        f.subjects_handled = sc.next();
        int temp_age = sc.nextInt();
        f.yoe = sc.nextInt();
        f.no_research_consltncy_projs = sc.nextInt();
        f.no_designations = sc.nextInt();

        if (temp_age <= 58) {
            f.age = temp_age;
        }
        else{
            throw new MyException("AgeException! Your age should be less than 58 years");
        }
    }
    catch(MyException e){
        int age1;
        do{System.out.println(e.getMessage());
        System.out.println("Enter the faculty age again");
        age1 = sc.nextInt();}while(age1>58);
        f.age = age1;

    }
    }
    

    
    public void printData(Faculty f) {
        System.out.println("name: "+f.name);
        System.out.println("designation: "+f.designation);
        System.out.println("joining date: "+f.joining_date);
        System.out.println("subjects handled: "+f.subjects_handled);
        System.out.println("age: "+f.age);
        System.out.println("years of experience: "+f.yoe);
      
    }

    
    public void print_no_desinations(Faculty f) {
        System.out.println("Number of Designations: "+f.no_designations);
    }

    
    public void no_research_consltncy_projs(Faculty f) {
        System.out.println("Number of Research Consultancy Projects: "+f.no_research_consltncy_projs);
    }
}

// name, designation, joining_date, subjects_handled
//age, yoe, no_research_consltncy_projs, no_designations
