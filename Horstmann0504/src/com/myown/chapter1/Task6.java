package com.myown.chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class Task6 {
    public void execute() {
        compute(1000);
    }

    public void compute(int num) {
        BigInteger bigInteger = new BigInteger("1");
        for (int i = 1; i <= num; i++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bigInteger);
    }
}
