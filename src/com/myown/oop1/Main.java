package com.myown.oop1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle);

        System.out.println();

        Circle circle = new Circle();
        System.out.println(circle.calculateArea());
        System.out.println(circle.getColor());
        System.out.println(circle.getCurrentObject());
        System.out.println(circle.getRadius());
        System.out.println(circle);

        System.out.println();

        Employee employee = new Employee(2, "George", "Washington", 500);
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getId());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getName());
        System.out.println(employee.raiseSalary(80));
        System.out.println(employee);

        System.out.println();
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Geaorge Stone", "doit@mail.com", 'M'));
        authors.add(new Author("Tony Starl", "idkwhattowrite@mail.com", 'M'));
        authors.add(new Author("Puul Bear", "pom@mail.com", 'F'));
        Book book = new Book("Do it", authors, 400.0, 2);
        for (Author a : authors) {
            System.out.println(a.getName());
        }
        System.out.println();
        System.out.println(book);

        System.out.println();

        MyTriangle myTriangle = new MyTriangle(10, 22, 4, 23, 54, 10);
        System.out.println(myTriangle);
    }
}
