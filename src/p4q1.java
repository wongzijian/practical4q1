/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author End User
 */
public class p4q1 {
    public static void main(String [] args){
        
        Employee emp1 = new Employee("WONG", 1000.00);
        Employee employee2 = new Employee("HALO");
        employee2.setSalary(5600.00);
        
        if(emp1.getSalary() > employee2.getSalary()){
            System.out.println(emp1.getName() + " " +emp1.getSalary());
        }
        else{
            System.out.println(employee2.getName() + " " + employee2.getSalary());
        }
        
        System.out.print(emp1.getSalary() + " + " + employee2.getSalary() + " = " + (emp1.getSalary() + employee2.getSalary()));  
        
        //Part (b)
//        System.out.println("Salary : " + emp1.getSalary());
//        
//        emp1.raiseSalary(8.0);
//        
//        System.out.println("Salary : " + emp1.getSalary());
        
    }

    
}
