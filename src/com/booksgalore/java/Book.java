package com.booksgalore.java;

/**
 * Created by katecatlin on 9/16/14.
 */
public class Book {

    private String author;
    private String title;
    private int numberOfPages;
    private static int totalBooksInLibrary = 0;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public static void setTotalBooksInLibrary() {
        totalBooksInLibrary++;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public static int getTotalBooksInLibrary() {
        return totalBooksInLibrary;
    }
}