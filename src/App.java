import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====\n");

        // MEMBER
        System.out.print("Enter member name: ");
        String name = sc.nextLine();

        System.out.print("Enter member ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        member m = new member(name, id);

        // BOOK
        System.out.print("Enter book name: ");
        String bookName = sc.nextLine();

        book b = new book(bookName);

        // LIBRARIAN
        System.out.print("Enter librarian name: ");
        String libName = sc.nextLine();

        System.out.print("Enter librarian ID: ");
        String libId = sc.nextLine();

        librarian l = new librarian(libName, libId);

        // LIBRARY
        library lib = new library();

        System.out.println();

        // MEMBER
        System.out.println("--- MEMBER ---");
        m.displayInfo();
        m.borrowBook();

        // BOOK
        System.out.println("--- BOOK ---");
        b.showBook();
        b.borrowBook();
        b.returnBook();

        // LIBRARY (NEW FEATURES)
        System.out.println("--- LIBRARY ---");
        lib.addBook(b);
        lib.showBooks();
        lib.saveToFile();
        lib.loadFromFile();

        sc.close();
    }
}