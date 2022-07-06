package OpenClosed.WithPrinciple;

public class EmployeeSemiSenior extends Employee implements ICalculateSalary{

    public EmployeeSemiSenior(String name, int age, int id, double salary) {
        super(name, age, id, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary() + 635000;
    }
}
