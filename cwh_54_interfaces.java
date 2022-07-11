package com.Learn;
interface Bicycle{
    int a=45; // by default final
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface MornBicycle{

    void blowHornK3g();
    void blowHornmhn();
}
class AvonCycle implements Bicycle,MornBicycle{

    void blowHorn(){
        System.out.println("pee pee po po");
    }

    public void applyBreak(int decrement){
        System.out.println("applying break");
    }
    public void speedUp(int increment){
        System.out.println("applying speedup");
    }
    public void blowHornK3g(){
        System.out.println("kabhi khusi kabhi gumm");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon Na pee pee poo poo");
    }
}


public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleShivam=new AvonCycle();
        cycleShivam.applyBreak(1);
        // you can create properties in interfaces
        System.out.println(cycleShivam.a);
        //you cannot modify the properties(attributes) in interfaces as they are final
//        cycleShivam.a=99;
        cycleShivam.blowHornK3g();
        cycleShivam.blowHornmhn();

    }
}
