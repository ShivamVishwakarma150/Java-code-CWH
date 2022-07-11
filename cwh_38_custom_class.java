package com.Learn;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is : "+id);
        System.out.println("My name is : "+name);
    }
    public int getSalary()
    {
        return salary;
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        Employee shivam=new Employee(); // instantiating a new Employee object
        Employee john = new Employee();
        //setting Attributes
        shivam.id=158;
        shivam.name="Shivam vishwakarma";
        shivam.salary=12000;

        //setting attributes for john
        john.id=17;
        john.name="john sharma";
        john.salary=15000;

        //printing the attributes
        shivam.printDetails();
        john.printDetails();
        System.out.println("John salary is : "+john.getSalary());
//        System.out.println(shivam.id);
//        System.out.println(shivam.name);
    }
}
