import employee.Employee;
import service.EmployeeService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService service = new EmployeeService();

        while (true) {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Display All Employees");
            System.out.println("4. Display Employees Alphabetically");
            System.out.println("5. Modify Employee Data");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Salary: ₹");
                    double salary = sc.nextDouble();
                    service.addEmployee(new Employee(id, name, dept, salary));
                    break;

                case 2:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    service.deleteEmployee(delId);
                    break;

                case 3:
                    service.displayEmployees();
                    break;

                case 4:
                    service.displayAlphabetically();
                    break;

                case 5:
                    System.out.print("Enter ID to modify: ");
                    int modId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new department: ");
                    String newDept = sc.nextLine();
                    System.out.print("Enter new salary: ₹");
                    double newSalary = sc.nextDouble();
                    service.modifyEmployee(modId, newName, newDept, newSalary);
                    break;

                case 6:
                    System.out.println("👋 Exiting... Thank you!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("⚠️ Invalid choice! Try again.");
            }
        }
    }
}
