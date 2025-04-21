package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Book> books;

    // Yapıcı metot, kitapları tutacak bir ArrayList oluşturuyoruz.1
    public Library() {
        books = new ArrayList<>();
    }

    // Kitap ekleme metodu
    public void addBooks(Book book) {
        books.add(book);  // Kitapları  ekliyoruz

    }

    // Kitapları listeleme metodu
    public ArrayList<Book> getBooks() {
        return books;

    }

    public void  returnBook(Book bookToBeReturned) {
        String ISBN = bookToBeReturned.getIsbn();
        for (Book book : books) {
            if (book.getIsbn().equalsIgnoreCase(ISBN)) {
                book.setRented(false);
            }
        }

    }

    public void rentBook(Book bookToBeRented){
        String ISBN = bookToBeRented.getIsbn();
        for (Book book : books){
            if (book.getIsbn().equalsIgnoreCase(ISBN)){
                book.setRented(true);
            }
        }
    }
}