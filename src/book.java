 public class book {

    static int totalBooks = 0;
    private String title;
    private boolean available = true;

    public book(String title) {
        this.title = title;
        totalBooks++;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " borrowed.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println(title + " returned.");
    }

    public void showBook() {
        System.out.println("Book Title : " + title);
        System.out.println("Available  : " + available);
    }
} 
    

