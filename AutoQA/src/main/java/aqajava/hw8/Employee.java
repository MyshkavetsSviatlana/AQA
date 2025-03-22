package aqajava.hw8;

/*
1. Create a class "Employee" with the following fields: Full Name, Position, Email, Phone, Salary, Age.
2. The class constructor should fill these fields when creating an object.
3. Inside the "Employee" class, write a method that outputs the information about the object to the console.
4. Create an array of 5 employees.
5. Use a loop to output information only about employees older than 40 years.
 */

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public static void main(String[] args) {
        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee("Dom Cobb", "architect", "d.cobb@inception.com", "00375291234567", 400000, 35);
        employeeList[1] = new Employee("Robert Fischer", "owner", "r.fischer@inception.com", "00375292345678", 900000, 33);
        employeeList[2] = new Employee("Peter Browning", "CEO", "p.browning@inception.com", "00375293456789", 700000, 60);
        employeeList[3] = new Employee("Stephen Miles", "expert", "s.miles@inception.com", "00375294567890", 200000, 77);
        employeeList[4] = new Employee("Ariadne Page", "architect", "a.page@inception.com", "00375295678901", 300000, 23);

        System.out.println("Employees over 40: ");
        for (Employee employee : employeeList) {
            if (employee.age > 40) {
                System.out.println();
                employee.getInfo();
            }
        }
    }

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Full name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }
}
