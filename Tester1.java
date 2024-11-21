public class Tester1 {
    public static void main(String[] args) {
        // Membuat objek dari setiap kelas
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        IntershipEmploye iEmp = new IntershipEmploye("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        // Polymorphism dengan objek Employee dan Payable
        Employee e;
        Payable p;

        e = pEmp; // Employee reference pointing to PermanentEmployee
        e = iEmp; // Employee reference pointing to InternshipEmployee

        p = pEmp; // Payable reference pointing to PermanentEmployee
        p = eBill; // Payable reference pointing to ElectricityBill

        // Menampilkan informasi
        System.out.println("Permanent Employee Info:");
        System.out.println(pEmp.getEmployeeInfo());
        System.out.println("Internship Employee Info:");
        System.out.println(iEmp.getEmployeeInfo());
        System.out.println("Electricity Bill Info:");
        System.out.println(eBill.getBillInfo());
    }
}
