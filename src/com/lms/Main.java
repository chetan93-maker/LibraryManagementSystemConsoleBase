package com.lms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("--- LIBRARY MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Book");
            System.out.println("2. Register User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Show All Books");
            System.out.println("6. Show All Users");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(title, author));
                    break;

                case 2:
                    System.out.print("Enter User Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter User ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    library.registerUser(new User(name, id));
                    break;

                case 3:
                    System.out.print("Enter Book Title to Issue: ");
                    String issueTitle = sc.nextLine();
                    System.out.print("Enter User ID: ");
                    int issueUserId = sc.nextInt();
                    sc.nextLine();
                    library.issueBook(issueTitle, issueUserId);
                    break;

                case 4:
                    System.out.print("Enter Book Title to Return: ");
                    String returnTitle = sc.nextLine();
                    library.returnBook(returnTitle);
                    break;

                case 5:
                    library.showAllBooks();
                    break;

                case 6:
                    library.showAllUsers();
                    break;

                case 7:
                    System.out.println("Exiting Library System... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
