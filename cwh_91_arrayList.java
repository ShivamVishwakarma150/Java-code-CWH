package com.Learn;

import java.util.*;

public class cwh_91_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>(5);
        l2.add(15);
        l2.add(12);
        l2.add(16);


        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(5);
        l1.add(0,5);
        l1.add(0,6);
        l1.addAll(l2);
        System.out.println(l1.contains(5));
        System.out.println(l1.indexOf(6));
//        l1.clear() // clear array elements

        l1.removeIf (n-> (n% 2!=0) ); // remove with certain condition
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }
    }
}
