package com.myown.chapter1;

import java.util.ArrayList;
import java.util.Random;

public class Task13 {
    ArrayList<Integer> list = new ArrayList<>();
    public void execute() {
        for (int i = 0; i < 49; i++) {
            list.add(i + 1);
        }
        ArrayList<Integer> newList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            int tmp = random.nextInt(49 - i);
            newList.add(list.get(tmp));
            list.remove(tmp);
        }

        for (Integer i : newList) {
            System.out.println(i);
        }
    }
}
