package com.myown.oop1;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Book {
    private String name;
    private ArrayList<Author> authors;
    private double price;
    private int qty = 0;

    public Book(String name, ArrayList<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, ArrayList<Author> authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

//    public void setAuthors(ArrayList<Author> authors) {
//        this.authors = authors;
//    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        StringJoiner sj = new StringJoiner(",");
        for (Author a : authors) {
            sj.add(a.getName());
        }
        return sj.toString();
    }

    @Override
    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                ", qty=" + qty +
                ']';
    }
}
