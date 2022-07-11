package com.Learn;

import java.util.Scanner;

public class cwh_86_ps14 {
    public static void main(String[] args) {
        // problem 1
        // syntax error int a=7
        int age=78;
        int year_born=2000-78; // logical error

//        System.out.println(6/0);
        // problem 2
//        try{
//            int a=666/0;
//
//
//        }
//        catch(IllegalArgumentException e)
//        {
//            System.out.println("haha");
//        }
//        catch(ArithmeticException e){
//            System.out.println("Hihi");
//        }

            //problem 3

        boolean flag=true;
        int []marks =new int[3];
        marks[0]=1;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index");
                index= sc.nextInt();
                System.out.println("The value of marks[index] is "+marks[index]);
                i++;
            }
            catch(Exception e)
            {
                System.out.println("Invalid index");
                i++;
            }

        }
    }
}
