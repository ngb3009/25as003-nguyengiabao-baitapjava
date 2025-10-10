package ex14;

public class Main2 {
    public static void main(String[] args) {
        Employee e1 = new Employee(003, "Nguyen", "Bao", 9999999);
        System.out.println(e1);
        e1.setSalary(99999999);
        System.out.println(e1);
        System.out.println("id is: " + e1.getID());
        System.out.println("firstname is: " + e1.getFirstname());
        System.out.println("lastname is: " + e1.getLastname());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method
        System.out.println(e1.raiseSalary(100));
        System.out.println(e1);
    }
}
