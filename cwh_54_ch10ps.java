package com.Learn;

class Circle{

    public int radius;
    Circle(){
        System.out.println("I am circle non parameterized constructor");
    }
    Circle(int r){
        System.out.println("I am circle parameterized constructor : ");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r,int h)
    {
        super(r);
        System.out.println("I am cylinder 1 parameterized constructor");
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwh_54_ch10ps {
    public static void main(String[] args) {
//        Circle obj1=new Circle();
        Cylinder1 obj=new Cylinder1(4,5);

    }
}
