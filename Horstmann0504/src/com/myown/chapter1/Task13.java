package com.myown.chapter1;

import java.util.ArrayList;
import java.util.Random;

public class Task13 {
    ArrayList<Integer> list = new ArrayList<>();
    public void execute() {
        for (int i = 1; i <= 49; i++) {
            list.add(i);
        }
//        for (Integer i : list) {
//            System.out.println(i);
//        }
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int pop = Math.abs(random.nextInt(50) + 1 - i);
//            System.out.println(pop);
            newList.add(list.get(pop - 1));
            list.remove(new Integer(pop));
        }
        for (Integer i : newList) {
            System.out.println(i);
        }

    }
}
