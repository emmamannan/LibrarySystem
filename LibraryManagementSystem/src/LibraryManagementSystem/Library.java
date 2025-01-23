package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> booklist;

    public Library() {
    	booklist = new ArrayList<>();
    }

    public void addBook(Book book) {
    	booklist.add(book);
    }

    public void removeBook(String ISBN) {
        for (Book book : booklist) {
            if (book.ISBN.equals(ISBN)) {
            	booklist.remove(book);
                break;
            }
        }
    }

    public void showBooks() {
        for (Book book : booklist) {
            System.out.println("Title: " + book.title);
            System.out.println("Author: " + book.author);
            System.out.println("ISBN: " + book.ISBN);
            System.out.println("Availability: " + book.availability);
            System.out.println();
        }
    }
	
}
