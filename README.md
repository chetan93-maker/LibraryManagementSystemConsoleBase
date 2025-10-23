📚 Library Management System (Java OOP Project)
🧠 Objective

A simple Java Console Application that demonstrates Object-Oriented Programming (OOP) concepts such as Abstraction, Encapsulation, Polymorphism, and Composition by managing books and users in a library.

🧩 Classes Used
Class Name	Description
Book.java	Represents a book with attributes like title, author, and issued status.
User.java	Represents a library user with name and ID.
Library.java	Manages lists of books and users, and handles issuing and returning books.
Main.java	Contains the interactive menu-driven system using Scanner class for user input.
⚙️ Features

✅ Add new books
✅ Register library users
✅ Issue and return books
✅ Display all books and users
✅ Prevent issuing already-issued books
✅ Simple console-based menu for user interaction

🧱 OOP Concepts Implemented
Concept	Explanation
Abstraction	Classes hide internal implementation details.
Encapsulation	Private fields with public methods (getters/setters).
Polymorphism	Overridden toString() methods for clean output.
Composition (HAS-A)	Library has Books and Users.
🛠️ Tools & Environment

Language: Java

IDE: VS Code / IntelliJ IDEA

Java Version: JDK 17 or later

Input: Scanner (console-based)

▶️ How to Run

Open terminal or command prompt in your project folder.

Compile all files:

javac *.java


Run the program:

java Main


Use the on-screen menu options to:

Add books

Register users

Issue / Return books

View lists

🧾 Sample Output
===== 📚 LIBRARY MANAGEMENT SYSTEM =====
1. Add Book
2. Register User
3. Issue Book
4. Return Book
5. Show All Books
6. Show All Users
7. Exit
Enter your choice: 1
Enter Book Title: Java Basics
Enter Author Name: James Gosling
✅ Book added: Java Basics

===== 📚 LIBRARY MANAGEMENT SYSTEM =====
Enter your choice: 2
Enter User Name: Chetan
Enter User ID: 101
👤 User registered: Chetan

===== 📚 LIBRARY MANAGEMENT SYSTEM =====
Enter your choice: 3
Enter Book Title to Issue: Java Basics
Enter User ID: 101
📘 Book 'Java Basics' issued to User ID: 101

===== 📚 LIBRARY MANAGEMENT SYSTEM =====
Enter your choice: 4
Enter Book Title to Return: Java Basics
📗 Book 'Java Basics' returned successfully!

🧩 File Structure
LibraryManagement/
│
├── Book.java
├── User.java
├── Library.java
└── Main.java

✍️ Author

Chetan Sathe
📧 chetansathe33@gmail.com
