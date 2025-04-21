package LibraryManagementSystem;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Welcome to Library Management System!");
        System.out.println();
        System.out.println("Please select an option:");
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        Library library = new Library();

     while (running)  {

        printMenu();

        int choice = scanner.nextInt();
        scanner.nextLine();

                switch (choice) {
                    case 1:
                        addNewBook(scanner,library);
                        break;

                    case 2:
                        displayAllBooks(library);
                        break;

                    case 3:
                        searchForBookByTitle(scanner,library);

                        break;
                    case 4:
                        rentBook(library,scanner);
                        break;
                    case 5:
                        returnBook(scanner,library);
                        break;
                    case 6:
                        System.out.println("Thank you for using the Library Management System!");
                        running = false;
                        break;
                    default:
                        System.out.println("You entered wrong number !");

                }
        }
    }

    public static void printMenu(){
        System.out.println("1. Add new book ");
        System.out.println("2. Display all books ");
        System.out.println("3. Search for a book by title ");
        System.out.println("4. Rent a book with ISBN ");
        System.out.println("5. Return a book ");
        System.out.println("6. Exit the library ");
        System.out.print("Enter your choice:");
    }

    public static void addNewBook(Scanner scanner , Library library) {

        System.out.print("Enter Title : ");
        String title = scanner.nextLine();

        System.out.print("Enter Author : ");
        String author = scanner.nextLine();

        System.out.print("Enter ISBN no :");
        String isbn = scanner.nextLine();

        Book book = new Book();
        book.setBookTitle(title);
        book.setAuthor(author);
        book.setIsbn(isbn);

        library.addBooks(book);
        System.out.println("Book added successfully ! ");

    }

    private static void displayAllBooks(Library library) {
        List<Book> books = library.getBooks();

        if (books.isEmpty()){
            System.out.println("No Books available  in the library");
        } else {
            Collections.sort(books, new Comparator<Book>() {
                @Override
                public int compare(Book book1, Book book2) {
                    return book1.getBookTitle().compareToIgnoreCase(book2.getBookTitle());

                }
            });
        }
        System.out.println("Books in the Library:");
        System.out.println("---------------------");

        for (Book book : books){
            System.out.println("Title     : " + book.getBookTitle());
            System.out.println("Author    : " + book.getAuthor());
            System.out.println("ISBN      : " + book.getIsbn());
            System.out.println("Available : " + (book.isRented() ? "No" : "Yes"));
            System.out.println("---------------------");
        }

    }

    private static void searchForBookByTitle(Scanner scanner,Library library) {

        System.out.println("Enter book Title ");
        String enteredTitle = scanner.nextLine();

        List<Book> books = library.getBooks();
        boolean isFound = false;

        for (Book book : books) {
            if (book.getBookTitle().equalsIgnoreCase(enteredTitle)) {
                System.out.println("Book Found:");
                System.out.println("---------------------");
                System.out.println("Title     : " + book.getBookTitle());
                System.out.println("Author    : " + book.getAuthor());
                System.out.println("ISBN      : " + book.getIsbn());
                System.out.println("Available : " + (book.isRented() ? "No" : "Yes"));
                System.out.println("---------------------");
                isFound = true;
                break;
            }
        }
            if (!isFound){
                System.out.println("There is no book in this title!");
            }
        }

    private static void rentBook(Library library, Scanner scanner) {

        System.out.print("Enter book ISBN:");
        String enteredISBN = scanner.nextLine();
        List<Book> books = library.getBooks();

        boolean foundBook = false;
        boolean rentedBook = false;
        for (Book book : books) {
            if (enteredISBN.equalsIgnoreCase(book.getIsbn())) {
                foundBook = true;


                if (!book.isRented()) {
                    book.setRented(true);  // Kitap kiralanmış olarak işaretleniyor
                    System.out.println("You have successfully rented the book: " + book.getBookTitle());
                    rentedBook = true;
                } else {
                    // Eğer kitap zaten kiralanmışsa
                    System.out.println("Sorry, the book is already rented!");
                }
                break;  // Kitap bulunduğunda, döngüden çıkıyoruz
            }
        }
        if (!foundBook){
            System.out.println("Sorry,the book with ISBN " + "'"+ enteredISBN + "'" +" was not found or is already rented!" );
        }

      }

    public static void returnBook(Scanner scanner,Library library) {
        boolean isReturn = false;
        System.out.println("Please enter the ISBN of the book you want to return!");
        String ISBN = scanner.nextLine();

        List <Book> books = library.getBooks();

        for (Book book : books){
            if (book.getIsbn().equalsIgnoreCase(ISBN)){
                library.returnBook(book);
                System.out.println("Book returned successfully!");
                isReturn = true;
            }
        }
        if (!isReturn){
            System.out.println("You entered the wrong ISBN!");
        }
    }
  }


