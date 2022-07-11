package com.Learn;

class myThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<40000){
            System.out.println("My Thread is Making food");
            System.out.println("I am Happy");
            i++;
        }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
        int j=0;
        while(j<40000){
            System.out.println("My Thread2 for chatting with her ");
            System.out.println("I am Sad");
            j++;
        }
    }
}

public class cwh_70 {
    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        myThread2 t2=new myThread2();
        t1.start();
        t2.start();
    }
}
