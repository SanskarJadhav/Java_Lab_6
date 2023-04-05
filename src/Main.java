import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department or employee? D/E  ");
        char choice = sc.next().charAt(0);
        switch (choice){
            case 'D':
                Department d = new Department();
                d.displayDetails(d.name);
                d.deptsize();
                break;
            case 'E':
                Employee e = new Employee();
                e.displayDetails(e.name);
                e.empinfo();
                break;
            default:
                System.out.println("Wrong input. Please enter D or E.");
        }
    }
}
