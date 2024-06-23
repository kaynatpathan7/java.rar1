public class p5 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 80000, "HR");
        Developer developer = new Developer("Bob", 102, 60000, "Java Developer");

        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);

        EmployeeUtilities.increaseSalary(manager, 5000);
        EmployeeUtilities.increaseSalary(developer, 3000);

        System.out.println("\nAfter Salary Increment:");
        EmployeeUtilities.printEmployeeDetails(manager);
        EmployeeUtilities.printEmployeeDetails(developer);
    }

    static class Employee {
        private String name;
        private int employeeId;
        private double salary;

        public Employee(String name, int employeeId, double salary) {
            this.name = name;
            this.employeeId = employeeId;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }

    static class Manager extends Employee {
        private String department;

        public Manager(String name, int employeeId, double salary, String department) {
            super(name, employeeId, salary);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
    }

    static class Developer extends Employee {
        private String specialization;

        public Developer(String name, int employeeId, double salary, String specialization) {
            super(name, employeeId, salary);
            this.specialization = specialization;
        }

        public String getSpecialization() {
            return specialization;
        }

        public void setSpecialization(String specialization) {
            this.specialization = specialization;
        }
    }

    static class EmployeeUtilities {
        public static void printEmployeeDetails(Employee employee) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Salary: " + employee.getSalary());
        }

        public static void increaseSalary(Employee employee, double increment) {
            double newSalary = employee.getSalary() + increment;
            employee.setSalary(newSalary);
        }
    }
}
