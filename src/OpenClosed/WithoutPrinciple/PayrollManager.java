package OpenClosed.WithoutPrinciple;

import java.util.List;

public class PayrollManager {
    private List<Employee> listOfEmployees;

    public PayrollManager(List<Employee> listOfEmployees) {
        this.listOfEmployees = listOfEmployees;
    }

    public double calculateNomine(){
        double total=0;

        for (Employee i : listOfEmployees) {
            if(i.getType().equalsIgnoreCase("senior")) {
                total+= i.getSalary() + 1350000;
            }
            if(i.getType().equalsIgnoreCase("semi senior")) {
                total+= i.getSalary() + 635000;
            }
            if(i.getType().equalsIgnoreCase("junior")) {
                total+= i.getSalary() + 200000;
            }
            //what happen if some day the requirements change? we should to modify this class
        }

        return total;
    }

}
