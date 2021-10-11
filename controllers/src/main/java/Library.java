import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.extern.java.Log;

public class Library {
    public ArrayList<Book> books;
    public Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public Library(String path) throws IOException {
        books = new ArrayList<>();
        FileReader fr = new FileReader(path);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();

        while (line != null){
            String[] s = line.split(" : ");
            String title = s[1];
            String name = s[0];
            String[] n = name.split(" ");
            String firstName = n[0];
            String lastName = n[1];
            Author author = new Author(firstName, lastName);
            books.add(new Book(title, author));
            line = reader.readLine();
        }
    }

    public void printBooksByAuthor(String firstName, String lastName){
        for (Book book : books){
            if (book.getAuthor().getFirstName().equals(firstName) && book.getAuthor().getLastName().equals(lastName)){
                System.out.println(gson.toJson(book));
            }
        }
    }
}
