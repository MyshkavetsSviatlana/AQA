package aqajava.hw8;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[5];
        employeeList[0] = new Employee("Dom Cobb", "architect", "d.cobb@inception.com", "00375291234567", 400000, 35);
        employeeList[1] = new Employee("Robert Fischer", "owner", "r.fischer@inception.com", "00375292345678", 900000, 33);
        employeeList[2] = new Employee("Peter Browning", "CEO", "p.browning@inception.com", "00375293456789", 700000, 60);
        employeeList[3] = new Employee("Stephen Miles", "expert", "s.miles@inception.com", "00375294567890", 200000, 77);
        employeeList[4] = new Employee("Ariadne Page", "architect", "a.page@inception.com", "00375295678901", 300000, 23);

        System.out.println("Employees over 40: ");
        for (Employee employee : employeeList) {
            if (employee.getAge() > 40) {
                System.out.println();
                employee.getInfo();
            }
        }
    }

}
