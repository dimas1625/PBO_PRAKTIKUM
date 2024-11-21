public class PermanentEmployee extends Employee implements Payable {
    private int salary;

    // Constructor
    public PermanentEmployee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Overriding getPaymentAmount method
    @Override
    public int getPaymentAmount() {
        return (int) (salary + 0.05 * salary);
    }

    // Overriding getEmployeeInfo method
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as permanent employee with salary " + salary + "\n";
        return info;
    }
}
