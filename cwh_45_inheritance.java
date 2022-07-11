package com.Learn;
class Base{
    int x;
    public void printMe(){
        System.out.println("I am a method ");
    }

    public int getX() {

        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now : ");
        this.x = x;
    }
}
class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived and setting y now : ");
        this.y = y;
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
            //Creating an Object of base class
            Base b=new Base();
            b.setX(10);
            System.out.println(b.getX());

            //creating an object of Derived class
            Derived d=new Derived();
            d.setY(43);
            System.out.println(d.getY());
    }
}
