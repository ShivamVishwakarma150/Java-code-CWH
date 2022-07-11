package com.Learn;

import com.sun.security.jgss.GSSUtil;

abstract class Pen{
    abstract void refill();
    abstract void write();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("write..");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements  BasicAnimal{
    void speak(){
        System.out.println("Hello sir ... ");

    }
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping...");
    }
}
public class cwh_60_ch11ps {
    public static void main(String[] args) {
        //ans1
        FountainPen pen = new FountainPen();
        pen.changeNib();

        //ans2
        Human shivam = new Human();
        shivam.sleep();

        //ans5
        Monkey m1=new Human();
//        m1.speak();// Cannot use speak method because the reference is monkey which does not have speak method
        m1.jump();
        m1.bite();


        BasicAnimal lovish=new Human();
        lovish.sleep();
        lovish.eat();
    }
}
