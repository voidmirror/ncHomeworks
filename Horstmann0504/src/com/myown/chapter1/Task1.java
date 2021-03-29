package com.myown.chapter1;

import java.util.Scanner;

public class Task1 {
    Integer num = 0;

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        System.out.println("Hex: " + Integer.toHexString(num));
        double reciprocal = Math.pow(num, -1);
        System.out.println("Hex-reciprocal: " + Double.toHexString(reciprocal));
//        System.out.println(Integer.(num));
    }
}
