package com.Learn;

public class cwh_34_recursion {
    static int factorial(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    static int fact(int n)
    {
        int facto=1;
        for(int i=1;i<=n;i++)
        {
            facto*=i;
        }
        return facto;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }
}
