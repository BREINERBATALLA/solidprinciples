package OpenClosed.WithPrinciple;

public class Employee{
    private String name;
    private int age;
    private int id;
    private double salary;


    public Employee(String name, int age, int id, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //we don't need to especify the type, because we're gonna give all the responsibility to the Object.

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
