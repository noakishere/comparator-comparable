/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cstuser
 */
public class Employee implements Comparable<Employee> {
    
    private int salary;
    private String name;
    private int age;
    
    public Employee(int s, String n, int a){
        this.salary = s;
        this.name = n;
        this.age = a;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    @Override
    public int compareTo(Employee t) {
        return this.salary-t.salary;
    }
}
