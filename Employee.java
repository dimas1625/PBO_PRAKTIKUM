public class Employee{
    protected String name;

    public String getEmployeeInfo() {
        return "Name = "+ name;
    }
    public interface Payable {
        int getPaymentAmount();
    }    
}
