package com.springCore.ContructorInjection;

public class Book {
    private int id;
    private String name;
    private String Author;
    private Certi certi;
    public Book(int id, String name, String author, Certi certi) {
        this.id = id;
        this.name = name;
        Author = author;
        this.certi = certi;
    }

    @Override
    public String toString() {
        return this.id+ " : "+this.name+ " : "+this.Author+" {" +this.certi.name+ "}";
    }
}
