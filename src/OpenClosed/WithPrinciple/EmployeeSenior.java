package OpenClosed.WithPrinciple;

public class EmployeeSenior extends Employee implements ICalculateSalary{

    public EmployeeSenior(String name, int age, int id, double salary) {
        super(name, age, id, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary() + 1350000;
    }
}
