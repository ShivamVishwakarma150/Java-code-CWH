package com.Learn;

interface sampleInterface{
    void meth1();
    void meth2();
}
interface  childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();

}
class mySmapleClass implements childSampleInterface{

    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}

public class cwh_58_inheritance_in_interfaces {
    public static void main(String[] args) {

    }
}
