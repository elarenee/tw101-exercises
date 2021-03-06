package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {
        String matches = findBooksContaining(partialBookTitle);
        printStream.println(matches);
        return matches;
    }

    public String findBooksContaining(String partialBookTitle) {
        String matches = new String();
        for (String title: books) {
            if(title.contains(partialBookTitle)) {
                matches += (title + ", ");
            }
        }
        return matches;
    }
}
