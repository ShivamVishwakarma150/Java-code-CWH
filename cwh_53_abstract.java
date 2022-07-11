package com.Learn;

abstract class Parent2{
    public Parent2(){
        System.out.println(" Mai Base 2 ka constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning .. ");
    }
    @Override
    public void greet2(){
        System.out.println("Good Evening .. ");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println(" I am good");
    }
}



public class cwh_53_abstract {
    public static void main(String[] args) {
//        Parent2 p=new Parent2(); // we cant do this
//        Child3 c=new Child3(); // we cant do this
        Child2 ch=new Child2(); // concrete class
    }
}
