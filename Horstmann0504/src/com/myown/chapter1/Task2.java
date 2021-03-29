package com.myown.chapter1;

import java.util.Scanner;

public class Task2 {
    int angle = 0;

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        angle = scanner.nextInt();
        angle = angle % 360;
        if (angle < 0) {
            angle = 360 + angle;
        }
        System.out.println(angle);
    }

    public void execute2() {
        Scanner scanner = new Scanner(System.in);
        angle = scanner.nextInt();
        angle = Math.floorMod(angle, 360);
        if (angle < 0) {
            angle = 360 + angle;
        }
        System.out.println(angle);
    }
}
