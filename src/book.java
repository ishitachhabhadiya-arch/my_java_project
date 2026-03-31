 public class book {

    private String title;
    private boolean available = true;

    public book(String title) {
        this.title = title;
    }

    public void showBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Available: " + available);
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed.");
        }
    }

    public void returnBook() {
        available = true;
        System.out.println("Book returned.");
    }

    public String getTitle() {
        return title;
    }
}