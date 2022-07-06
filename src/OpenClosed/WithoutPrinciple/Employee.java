package OpenClosed.WithoutPrinciple;

public class Employee {
    private String name;
    private int age;
    private int id;
    private String type;
    private double salary;


    public Employee(String name, int age, int id, String type, double salary) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
