package com.myown.chapter1;

import java.util.Scanner;

public class Task3 {
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a & b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public void execute2() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();

        System.out.println(Math.max(Math.max(a, b), Math.max(b, c)));
    }
}
