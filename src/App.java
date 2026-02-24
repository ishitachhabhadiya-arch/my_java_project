public class app {

    public static void main(String[] args) {

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====\n");

        member m = new member("Ishita", 1);
        book b = new book("Java Programming");
        librarian l = new librarian("John", "EMP001");
        library lib = new library();

        System.out.println("--- MEMBER ---");
        m.displayInfo();
        m.borrowBook();
        System.out.println();

        System.out.println("--- BOOK ---");
        b.showBook();
        b.borrowBook();
        b.returnBook();
        System.out.println();

        System.out.println("--- LIBRARIAN ---");
        l.displayInfo();
        System.out.println();

        System.out.println("--- LIBRARY ---");
        lib.showService();
    }
}