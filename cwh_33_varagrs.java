package com.Learn;

public class cwh_33_varagrs {
    static int sum(int ...var)
    {
        int total=0;
        for(int i:var)
        {
            total+=i;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("welcome to varargs Tutorial ");
        System.out.println("The sum of 4 and 5 is : "+sum());
        System.out.println("The sum of 4 and 5 is : "+sum(4,5));
        System.out.println("The sum of 4 and 5 is : "+sum(1,2,3,4,5));

    }
}
