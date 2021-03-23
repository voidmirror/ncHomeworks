package com.myown;

import com.myown.oop2.Ball;
import com.myown.oop2.Container;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(2, -2, 1, 1, 5);
        Container container = new Container(0, 0, 7, 7);
        System.out.println(ball + " " + container.collidesWidth(ball));
        ball.move();
        System.out.println(ball + " " + container.collidesWidth(ball));
        ball.move();
        System.out.println(ball + " " + container.collidesWidth(ball));

    }

}
