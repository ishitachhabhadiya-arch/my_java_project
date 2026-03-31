import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class library {

    ArrayList<book> books = new ArrayList<>();

    
    public void addBook(book b) {
        books.add(b);
        System.out.println("Book added.");
    }

    
    public void showBooks() {
        for (book b : books) {
            b.showBook();
        }
    }

    
    public void saveToFile() {
        try {
            FileWriter writer = new FileWriter("books.txt");

            for (book b : books) {
                writer.write(b.getTitle() + "\n");
            }

            writer.close();
            System.out.println("Saved to file.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    
    public void loadFromFile() {
        try {
            FileReader reader = new FileReader("books.txt");
            int data;

            System.out.println("Reading from file:");
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}