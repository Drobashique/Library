import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        LibraryFactory libraryFactory = new LibraryFactory();
        libraryFactory.addLibrary("./controllers/src/main/resources/library.txt");
        System.out.println("start");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String[] n = name.split(" ");
        libraryFactory.getLibrary().printBooksByAuthor(n[0], n[1]);
    }
}