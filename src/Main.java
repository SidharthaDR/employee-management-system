import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    sc.nextLine(); // clear buffer
                    String name = sc.nextLine();
                    System.out.print("Enter email: ");
                    String email = sc.nextLine();
                    System.out.print("Enter designation: ");
                    String designation = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    dao.addEmployee(new Employee(name, email, designation, salary));
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int idUpdate = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter name: ");
                    String upName = sc.nextLine();
                    System.out.print("Enter email: ");
                    String upEmail = sc.nextLine();
                    System.out.print("Enter designation: ");
                    String upDesig = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double upSalary = sc.nextDouble();
                    dao.updateEmployee(new Employee(idUpdate, upName, upEmail, upDesig, upSalary));
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int idDel = sc.nextInt();
                    dao.deleteEmployee(idDel);
                    break;

                case 4:
                    System.out.print("Enter ID to view: ");
                    int idView = sc.nextInt();
                    dao.viewEmployee(idView);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
