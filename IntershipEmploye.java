public class IntershipEmploye extends Employee {
    private int length;

    // Constructor
    public IntershipEmploye(String name, int length) {
        this.length = length;
        this.name = name;
    }

    // Getter for length
    public int getLength() {
        return length;
    }

    // Setter for length
    public void setLength(int length) {
        this.length = length;
    }

    // Overriding getEmployeeInfo method
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo() + "\n";
        info += "Registered as internship employee for " + length + " month/s\n";
        return info;
    }
}
