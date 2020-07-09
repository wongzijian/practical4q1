/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author End User
 */
public class Employee {
    private String name;
    private double salary;
    
    public Employee(){
        name = " ";
        salary = 0.0;
    }
    
    public Employee(String employeeName){
        name = employeeName;
        salary = 0.0;
    }
    
    public Employee(String employeeName, double currentSalary){
        name = employeeName;
        salary = currentSalary;
    }
    

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name1) {
        name = name1;
    }

    public void setSalary(double salary1) {
        salary = salary1;
    }
    
    public void raiseSalary(double percent){
        salary = salary + (salary * percent / 100.0);
    }
    
}
