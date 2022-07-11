package com.Learn;
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}
class Smartphone extends Phone{

    public void music(){
        System.out.println("Playing music...");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj=new Phone();
//        Smartphone smobj=new Smartphone();
//        obj.name();

        Phone obj = new Smartphone(); // Yes it is allowed
//        Smartphone obj2=new Phone(); // Not Allowed
        obj.on();
        obj.showTime();
//        obj.music(); // Not Allowed
    }
}
