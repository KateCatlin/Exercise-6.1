package com.booksgalore.java;

import java.util.Scanner;

/**
 * Created by katecatlin on 9/16/14.
 *
 */

public class BooksRock {
    public static Scanner in = new Scanner(System.in);
    public static Book myBook = new Book();

    public static void main(String[] args) {
        boolean bookLoop = true;
        String bookLoopYes;

        do {
            addBook();

            System.out.println("Your book, " + myBook.getTitle() + " by " + myBook.getAuthor() + " has \n" +
                    "" + myBook.getNumberOfPages() + " pages.");
            System.out.println("You now have " + Book.getTotalBooksInLibrary() + " books.");
            System.out.println("Would you like to add another book? Type y for yes and any other key for no!");
            bookLoopYes = in.nextLine();
            if (bookLoopYes .equals("y")) {
                continue;
            } else {bookLoop = false;
            }
            awesomeReading();
        } while (bookLoop);
    }

        public static void addBook() {

        System.out.println("Please enter the author of your book: ");
        myBook.setAuthor(in.nextLine());
        System.out.println("Please enter the title of your book: ");
        myBook.setTitle(in.nextLine());
        System.out.println("Please enter the number of pages: ");
        myBook.setNumberOfPages(in.nextInt());
        Book.setTotalBooksInLibrary();
        in.nextLine();
        }

        public static void awesomeReading() {
        System.out.println("Reading is awesome!");
    }
}

