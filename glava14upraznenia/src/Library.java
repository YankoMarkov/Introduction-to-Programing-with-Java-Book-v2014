import java.util.ArrayList;
import java.util.List;

public class Library {

    private String nameLibrary;
    public Book listBook = new Book();
    static List<Book> listBoking = new ArrayList<>();

    public String getNameLibrary() {
        return nameLibrary;
    }

    public void setNameLibrary(String nameLibrary) {
        this.nameLibrary = nameLibrary;
    }
}
