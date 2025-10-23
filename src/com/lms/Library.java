package com.lms;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public void issueBook(String title, int userId) {
        Book foundBook = null;
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isIssued()) {
                foundBook = b;
                break;
            }
        }

        if (foundBook != null) {
            foundBook.issueBook();
            System.out.println("Book '" + title + "' issued to User ID: " + userId);
        } else {
            System.out.println("Book not available or already issued!");
        }
    }

    public void returnBook(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && b.isIssued()) {
                b.returnBook();
                System.out.println("Book '" + title + "' returned successfully!");
                return;
            }
        }
        System.out.println("Book not found or not issued!");
    }

    public void showAllBooks() {
        System.out.println("All Books in Library:");
        for (Book b : books) {
            System.out.println("- " + b);
        }
    }

    public void showAllUsers() {
        System.out.println("Registered Users:");
        for (User u : users) {
            System.out.println("- " + u);
        }
    }
}
