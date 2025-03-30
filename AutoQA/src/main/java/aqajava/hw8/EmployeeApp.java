package aqajava.hw8;

public class EmployeeApp {
    public static void main(String[] args) {
        aqajava.hw8.Employee[] employeeList = new aqajava.hw8.Employee[5];
        employeeList[0] = new aqajava.hw8.Employee("Dom Cobb", "architect", "d.cobb@inception.com", "00375291234567", 400000, 35);
        employeeList[1] = new aqajava.hw8.Employee("Robert Fischer", "owner", "r.fischer@inception.com", "00375292345678", 900000, 33);
        employeeList[2] = new aqajava.hw8.Employee("Peter Browning", "CEO", "p.browning@inception.com", "00375293456789", 700000, 60);
        employeeList[3] = new aqajava.hw8.Employee("Stephen Miles", "expert", "s.miles@inception.com", "00375294567890", 200000, 77);
        employeeList[4] = new aqajava.hw8.Employee("Ariadne Page", "architect", "a.page@inception.com", "00375295678901", 300000, 23);

        System.out.println("Employees over 40: ");
        for (aqajava.hw8.Employee employee : employeeList) {
            if (employee.getAge() > 40) {
                System.out.println();
                employee.getInfo();
            }
        }
    }

}
