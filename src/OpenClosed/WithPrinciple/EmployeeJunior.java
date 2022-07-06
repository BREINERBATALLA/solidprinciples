package OpenClosed.WithPrinciple;

public class EmployeeJunior extends Employee implements ICalculateSalary{

    public EmployeeJunior(String name, int age, int id, double salary) {
        super(name, age, id, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary() + 200000;
    }
}
