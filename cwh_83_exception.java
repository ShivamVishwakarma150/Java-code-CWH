package com.Learn;

import java.util.Scanner;

class MyException extends Exception{


    @Override
    public String toString() {
        return super.toString()+" I am toString";
    }

    @Override
    public String getMessage() {
        return super.getMessage()+" I am get message";
    }
}
class MaxAgeException extends Exception{


    @Override
    public String toString() {
        return "age cannot greater than 125";
    }

    @Override
    public String getMessage() {
        return "Make sure that hte value of age entered is correct";
    }
}

public class cwh_83_exception {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();

        if(a<9)
        {
            try {
                throw new MyException();
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
            }
        }
    }
}
