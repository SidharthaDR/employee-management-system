public class Employee {
    private int id;
    private String name;
    private String email;
    private String designation;
    private double salary;

    // Constructor with all fields (including id)
    public Employee(int id, String name, String email, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.salary = salary;
    }

    // Overloaded constructor without ID (for adding a new employee)
    public Employee(String name, String email, String designation, double salary) {
        this.name = name;
        this.email = email;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
