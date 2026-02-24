public class member extends Person implements borrowable {

    private int borrowedBooks = 0;

    public member(String name, int personID) {
        super(name, personID);
    }

    public void displayInfo() {
        System.out.println("Member Name : " + getName());
        System.out.println("Member ID   : " + getPersonID());
        System.out.println("Books Borrowed: " + borrowedBooks);
    }

    public void borrowBook() {
        borrowedBooks++;
        System.out.println("Book borrowed successfully.");
    }

    public void returnBook() {
        borrowedBooks--;
        System.out.println("Book returned successfully.");
    }
}