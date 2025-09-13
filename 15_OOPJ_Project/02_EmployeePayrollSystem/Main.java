public class Main {
    

    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FULLTimeEmployee emp1 = new FULLTimeEmployee("Rahul", 1, 100);
        PartTimeEmployee emp2 = new PartTimeEmployee("Satish", 2, 40, 100);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Employee Detail");

        payrollSystem.displayEmployee();

        //removing Employee
        System.out.println("Removing Employee");
        payrollSystem.removeEmployee(2);

        System.out.println("Remaing Employee Detail");
        payrollSystem.displayEmployee();
    }

}

