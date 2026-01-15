package com.hackerpalm.coreconcepts.comparatorAndComparable;

public class BookExample implements Comparable<BookExample>{

    public int id;
    public String title;
    public String writer;
    public Double price;

    public BookExample() {

    }

    public BookExample(int id, String title,String writer, Double price) {
        this.id=id;
        this.title = title;
        this.writer = writer;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }





    @Override
    public String toString() {
        return "BookExample [id=" + id + ", title=" + title + ", writer=" + writer + ", price=" + price + "]";
    }

    @Override
    public int compareTo(BookExample o) {
        return this.writer.compareTo(o.writer);
    }
}
