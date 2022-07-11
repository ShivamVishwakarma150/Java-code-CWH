package com.Learn;

class Employee1{
    int salary;
    String name;
    public int getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
class CellPhone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate()
    {
        System.out.println("Vibrating....");
    }
}
class Square{
    int side;
    public int area()
    {
        return side*side;
    }
    public int perimeter()
    {
        return 4*side;
    }
}
class Tommy{
    public void hit()
    {
        System.out.println("Hitting the enemy ");
    }public void run()
    {
        System.out.println("Running from enemy ");
    }public void fire()
    {
        System.out.println("Firing on the enemy ");
    }
}
public class cwh_39_ch8ps {
    public static void main(String[] args) {
//        //problem 1
//        Employee1 shivam=new Employee1();
//        shivam.setName("Shivam vishwakarma");
//        shivam.salary=12000;
//        System.out.println(shivam.getSalary());
//        System.out.println(shivam.getName());

        //problem 2
//        CellPhone asus=new CellPhone();
//        asus.ring();
//        asus.vibrate();

        //problem 3
//        Square sq=new Square();
//        sq.side=3;
//        System.out.println(sq.area());
//        System.out.println(sq.perimeter());

//        //problem 3
//        Tommy player1=new Tommy();
//        player1.fire();
//        player1.hit();
//        player1.run();
    }
}
