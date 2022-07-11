package com.Learn;

import java.util.ArrayDeque;

public class cwh_93_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> d1=new ArrayDeque<>();
        d1.add(5); //add at the end of queue
        d1.offerFirst(45);
        d1.add(6);
        d1.addFirst(12);

//        System.out.println(d1.getFirst());
//        System.out.println(d1.getLast());

        d1.forEach((n)-> System.out.print(n+","));







    }
}
