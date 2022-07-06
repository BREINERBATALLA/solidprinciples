package OpenClosed.WithPrinciple;

import OpenClosed.WithoutPrinciple.Employee;

import java.util.List;

public class PayrollManager {
    private List<ICalculateSalary> iCalculateSalaryList;

    public PayrollManager(List<ICalculateSalary> iCalculateSalaryList) {
        this.iCalculateSalaryList = iCalculateSalaryList;
    }

    public double calculateNomine(){
        double total=0;

        for(ICalculateSalary i: iCalculateSalaryList) {
            total+= i.calculateSalary();
        }

        return total;
    }
}
