import java.io.IOException;
import java.util.ArrayList;

public class LibraryFactory {
    private Library library;
    public void addLibrary(String path) throws IOException {
        library = (new Library(path));
    }
    public Library getLibrary(){
        return this.library;
    }
}