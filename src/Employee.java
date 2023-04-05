import java.util.Scanner;

public class Employee extends IdDetails implements EmpInfo{
    String name;
    String dept;
    int age;
    Scanner sc = new Scanner(System.in);
    Employee(){
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the age: ");
        age = sc.nextInt();
        System.out.print("Enter the department: ");
        dept = sc.next();
    }
    @Override
    public void empinfo() {
        System.out.println("Age: "+age);
        System.out.println("Dept: "+dept);
        System.out.println("Email: "+name.replaceAll(" ",".").toLowerCase()+"@sit"+dept.toLowerCase()+".edu.in");
    }
}
