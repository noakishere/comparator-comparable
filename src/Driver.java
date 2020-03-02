
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class Driver {
    public static void main(String[] args){
        Employee e1 = new Employee(27, "Zbd", 24);
        Employee e2 = new Employee(126, "Ga",45);
        Employee e3 = new Employee(14, "Ab", 34);
        
        List<Employee> listOne = new ArrayList<>();
        listOne.add(e1); listOne.add(e2); listOne.add(e3);
        
        for(Employee e: listOne)
            System.out.println("Salary: " + e.getSalary());
        
        Collections.sort(listOne);
        System.out.println("\nUsing Comparable");
        for(Employee e: listOne)
            System.out.println("Salary: " + e.getSalary());
        
        System.out.println("\nUsing Comparator");
        Collections.sort(listOne, new CompareEmployee());
        for(Employee e: listOne)
            System.out.println("Name " + e.getName());
    }
}
