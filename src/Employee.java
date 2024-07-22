public class Employee  extends Person{
    private String employeeId;

    public Employee(int age, String name, String employeeId) {
        super(age, name);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
