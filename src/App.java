import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====\n");

        // MEMBER
        member m = null;
        try {
            System.out.print("Enter member name: ");
            String name = sc.nextLine();

            System.out.print("Enter member ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // clear buffer

            m = new member(name, id);

        } catch (Exception e) {
            System.out.println("Invalid member input!");
            sc.nextLine();
        }

        // BOOK
        book b = null;
        try {
            System.out.print("Enter book name: ");
            String bookName = sc.nextLine();

            b = new book(bookName);

        } catch (Exception e) {
            System.out.println("Invalid book input!");
        }

        // LIBRARIAN
        librarian l = null;
        try {
            System.out.print("Enter librarian name: ");
            String libName = sc.nextLine();

            System.out.print("Enter librarian ID: ");
            String libId = sc.nextLine();

            l = new librarian(libName, libId);

        } catch (Exception e) {
            System.out.println("Invalid librarian input!");
        }

        // LIBRARY
        library lib = new library();

        System.out.println();

        // DISPLAY MEMBER
        if (m != null) {
            System.out.println("--- MEMBER ---");
            m.displayInfo();
            m.borrowBook();
            System.out.println();
        }

        // DISPLAY BOOK
        if (b != null) {
            System.out.println("--- BOOK ---");
            b.showBook();
            b.borrowBook();
            b.returnBook();
            System.out.println();
        }

        // DISPLAY LIBRARIAN
        if (l != null) {
            System.out.println("--- LIBRARIAN ---");
            l.displayInfo();
            System.out.println();
        }

        // DISPLAY LIBRARY
        System.out.println("--- LIBRARY ---");
        lib.showService();

        sc.close();
    }
}