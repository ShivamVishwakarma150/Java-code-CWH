package com.Learn;

class Base1{
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        //super(0);// for running argument wala constructor from base1 class
        System.out.println("I am a derived class constructor");
    }
    Derived1(int x, int y){
        super(x); // for running constructor jaha argument me x pass ho rha hai
        System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
    }
}
class childOfDerived extends Derived1{
    childOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    childOfDerived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am an overloaded constructor of childOfDerived with value of z as "+z);
    }
}

public class cwh_46_constructor_in_inheritance {
    public static void main(String[] args) {
//            Base1 b =new Base1();
//            Derived1 d=new Derived1();
//            Derived1 d=new Derived1(14,9);
//            childOfDerived cd=new childOfDerived();
            childOfDerived cd=new childOfDerived(12,13,15);
    }
}
