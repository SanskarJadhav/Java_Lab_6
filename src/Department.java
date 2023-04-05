import java.util.Scanner;

public class Department extends IdDetails implements DeptSize {
    String name;
    int size;
    Scanner sc = new Scanner(System.in);
    Department(){
        System.out.print("Enter the department name: ");
        name = sc.next();
        System.out.print("Enter the size of the department: ");
        size = sc.nextInt();
    }
    @Override
    public void deptsize() {
        System.out.println("No. of Members: "+size);
    }
}
