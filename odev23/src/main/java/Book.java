public class Book {

  private  String author;
  private  String bookTitle;
  private  String isbn;
  private boolean Rented;

    public boolean isRented() {
        return Rented;
    }

    public void setRented(boolean rented) {
        Rented = rented;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return  " Found Books : \n " +
                "------------------- \n" +
                "author='" + author + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
