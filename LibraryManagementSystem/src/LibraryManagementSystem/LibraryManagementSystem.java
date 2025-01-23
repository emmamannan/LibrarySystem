package LibraryManagementSystem;

import java.util.Scanner;

public class LibraryManagementSystem {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. Add a Book");
            System.out.println("2. Remove a Book");
            System.out.println("3. Display List of Books");
            System.out.println("4. Exit Menu");

            int number = scanner.nextInt();

            if (number == 1) {
            	scanner.nextLine();
                System.out.print("Enter the title of the Book: ");
                String title = scanner.nextLine();
                System.out.print("Enter the author: ");
                String author = scanner.nextLine();
                System.out.print("Enter the ISBN: ");
                String ISBN = scanner.nextLine();
                System.out.print("Enter availability: ");
                boolean availability = scanner.nextBoolean();
                library.addBook(new Book(title, author, ISBN, availability));
            } else if (number == 2) {
            	scanner.nextLine();
                System.out.print("Enter ISBN: ");
                String ISBN = scanner.nextLine();
                library.removeBook(ISBN);
            } else if (number == 3) {
                library.showBooks();
            } else if (number == 4) {
                break;
            }
        }

        scanner.close();
    }

}
